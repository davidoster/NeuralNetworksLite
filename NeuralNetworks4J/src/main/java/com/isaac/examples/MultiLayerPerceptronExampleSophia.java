package com.isaac.examples;

import com.isaac.initialization.Activation;
import com.isaac.neuralnetworks.MultiLayerPerceptron;
import com.isaac.utils.Evaluation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiLayerPerceptronExampleSophia {

    public static void main(String[] args) {
        final Random rng = new Random(123); // seed random
        // Declare variables and constants
        final int patterns = 2; // nOut
        final int trainSetSize = 22;
        final int testSetSize = 10;
        final int nIn = 4;
        final int nHidden = 4;

        double[][] trainData = new double[trainSetSize][nIn];
        int[][] trainLabel = new int[trainSetSize][2];
        double[][] testData = new double[testSetSize][nIn];
        Integer[][] testLabel = new Integer[testSetSize][2];
        Integer[][] predictLabel = new Integer[testSetSize][patterns];

        final int epochs = 5000;
        double learningRate = 0.1;

        final int minibatchSize = 1; //  here, we do on-line training
        int minibatchNumber = trainSetSize / minibatchSize;

        double[][][] trainSetMinibatch = new double[minibatchNumber][minibatchSize][nIn];
        int[][][] trainLabelMinibatch = new int[minibatchNumber][minibatchSize][patterns];
        List<Integer> minibatchIndex = new ArrayList<>();
        for (int i = 0; i < trainSetSize; i++) {
            minibatchIndex.add(i);
        }
//        Collections.shuffle(minibatchIndex, rng);

        // Training simple XOR problem for demo
        //   class 1 : [0, 0], [1, 1]  ->  Negative [0, 1]
        //   class 2 : [0, 1], [1, 0]  ->  Positive [1, 0]
//        trainSet = new double[][]{{0., 0.}, {0., 1.}, {1., 0.}, {1., 1.}};
//        trainLabel = new int[][]{{0, 1}, {1, 0}, {1, 0}, {0, 1}};
//        testSet = new double[][]{{0., 0.}, {0., 1.}, {1., 0.}, {1., 1.}};
//        testLabel = new Integer[][]{{0, 1}, {1, 0}, {1, 0}, {0, 1}};

        // Train Data
        trainData[0][0] = 1120.0;
        trainData[0][1] = 55.867;
        trainData[0][2] = 29.4;
        trainData[0][3] = 43.9;

        trainData[1][0] = 2120.0;
        trainData[1][1] = 56.551;
        trainData[1][2] = 28.1;
        trainData[1][3] = 46.5;

        trainData[2][0] = 3120.0;
        trainData[2][1] = 57.108;
        trainData[2][2] = 25.0;
        trainData[2][3] = 59.0;

        trainData[3][0] = 4120.0;
        trainData[3][1] = 57.514;
        trainData[3][2] = 23.7;
        trainData[3][3] = 62.0;

        trainData[4][0] = 5120.0;
        trainData[4][1] = 57.844;
        trainData[4][2] = 25.2;
        trainData[4][3] = 58.4;

        trainData[5][0] = 6120.0;
        trainData[5][1] = 58.307;
        trainData[5][2] = 25.6;
        trainData[5][3] = 67.1;

        trainData[6][0] = 7120.0;
        trainData[6][1] = 58.477;
        trainData[6][2] = 24.0;
        trainData[6][3] = 60.6;

        trainData[7][0] = 8120.0;
        trainData[7][1] = 59.004;
        trainData[7][2] = 26.3;
        trainData[7][3] = 57.5;

        trainData[8][0] = 9120.0;
        trainData[8][1] = 59.401;
        trainData[8][2] = 28.4;
        trainData[8][3] = 56.0;

        trainData[9][0] = 10120.0;
        trainData[9][1] = 59.675;
        trainData[9][2] = 27.5;
        trainData[9][3] = 54.4;

        trainData[10][0] = 11120.0;
        trainData[10][1] = 59.905;
        trainData[10][2] = 28.9;
        trainData[10][3] = 54.0;
        
        trainData[11][0] = 12120.0;
        trainData[11][1] = 60.029;
        trainData[11][2] = 27.6;
        trainData[11][3] = 51.8;

        trainData[12][0] = 13120.0;
        trainData[12][1] = 60.186;
        trainData[12][2] = 26.5;
        trainData[12][3] = 52.4;

        trainData[13][0] = 14120.0;
        trainData[13][1] = 34.790;
        trainData[13][2] = 27.5;
        trainData[13][3] = 57.4;

        trainData[14][0] = 15120.0;
        trainData[14][1] = 34.488;
        trainData[14][2] = 26.4;
        trainData[14][3] = 50.2;

        trainData[15][0] = 16120.0;
        trainData[15][1] = 34.476;
        trainData[15][2] = 24.8;
        trainData[15][3] = 51.3;

        trainData[16][0] = 17120.0;
        trainData[16][1] = 34.431;
        trainData[16][2] = 26.3;
        trainData[16][3] = 48.4;

        trainData[17][0] = 18120.0;
        trainData[17][1] = 34.496;
        trainData[17][2] = 26.9;
        trainData[17][3] = 47.9;

        trainData[18][0] = 19120.0;
        trainData[18][1] = 34.486;
        trainData[18][2] = 27.1;
        trainData[18][3] = 50.6;

        trainData[19][0] = 20120.0;
        trainData[19][1] = 34.583;
        trainData[19][2] = 29.0;
        trainData[19][3] = 48.5;

        trainData[20][0] = 21120.0;
        trainData[20][1] = 34.498;
        trainData[20][2] = 27.3;
        trainData[20][3] = 51.4;

        trainData[21][0] = 22120.0;
        trainData[21][1] = 34.499;
        trainData[21][2] = 27.1;
        trainData[21][3] = 47.5;
        
        trainLabel[0][0] = 0;
        trainLabel[0][1] = 1;
        trainLabel[1][0] = 0;
        trainLabel[1][1] = 1;
        trainLabel[2][0] = 0;
        trainLabel[2][1] = 1;
        trainLabel[3][0] = 0;
        trainLabel[3][1] = 1;
        trainLabel[4][0] = 0;
        trainLabel[4][1] = 1;
        trainLabel[5][0] = 0;
        trainLabel[5][1] = 1;
        trainLabel[6][0] = 0;
        trainLabel[6][1] = 1;
        trainLabel[7][0] = 0;
        trainLabel[7][1] = 1;
        trainLabel[8][0] = 0;
        trainLabel[8][1] = 1;
        trainLabel[9][0] = 0;
        trainLabel[9][1] = 1;
        trainLabel[10][0] = 0;
        trainLabel[10][1] = 1;
        trainLabel[11][0] = 0;
        trainLabel[11][1] = 1;
        trainLabel[12][0] = 0;
        trainLabel[12][1] = 1;
        trainLabel[13][0] = 1;
        trainLabel[13][1] = 0;
        trainLabel[14][0] = 0;
        trainLabel[14][1] = 1;
        trainLabel[15][0] = 0;
        trainLabel[15][1] = 1;
        trainLabel[16][0] = 0;
        trainLabel[16][1] = 1;
        trainLabel[17][0] = 0;
        trainLabel[17][1] = 1;
        trainLabel[18][0] = 0;
        trainLabel[18][1] = 1;
        trainLabel[19][0] = 0;
        trainLabel[19][1] = 1;
        trainLabel[20][0] = 0;
        trainLabel[20][1] = 1;
        trainLabel[21][0] = 0;
        trainLabel[21][1] = 1;
        
        // Test Data
        testData[0][0] = 2121.0;
        testData[0][1] = 70.480;
        testData[0][2] = 16.2;
        testData[0][3] = 46.6;

        testData[1][0] = 3121.0;
        testData[1][1] = 39.711;
        testData[1][2] = 18.7;
        testData[1][3] = 40.3;

        testData[2][0] = 4121.0;
        testData[2][1] = 40.376;
        testData[2][2] = 19.1;
        testData[2][3] = 31.8;

        testData[3][0] = 5121.0;
        testData[3][1] = 41.699;
        testData[3][2] = 18.4;
        testData[3][3] = 32.2;

        testData[4][0] = 6121.0;
        testData[4][1] = 10.050;
        testData[4][2] = 21.7;
        testData[4][3] = 32.0;
        
        testData[5][0] = 7121.0;
        testData[5][1] = 34.465;
        testData[5][2] = 29.1;
        testData[5][3] = 41.3;

        testData[6][0] = 8121.0;
        testData[6][1] = 34.624;
        testData[6][2] = 25.3;
        testData[6][3] = 48.9;

        testData[7][0] = 9121.0;
        testData[7][1] = 34.732;
        testData[7][2] = 22.1;
        testData[7][3] = 58.1;

        testData[8][0] = 10121.0;
        testData[8][1] = 34.785;
        testData[8][2] = 25.9;
        testData[8][3] = 50.7;

        testData[9][0] = 11121.0;
        testData[9][1] = 34.483;
        testData[9][2] = 27.0;
        testData[9][3] = 49.4;
        
        testLabel[0][0] = 0;
        testLabel[0][1] = 1;
        testLabel[1][0] = 0;
        testLabel[1][1] = 1;
        testLabel[2][0] = 0;
        testLabel[2][1] = 1;
        testLabel[3][0] = 0;
        testLabel[3][1] = 1;
        testLabel[4][0] = 0;
        testLabel[4][1] = 1;
        testLabel[5][0] = 1; // was 0 for trygos
        testLabel[5][1] = 0;
        testLabel[6][0] = 0;
        testLabel[6][1] = 1;
        testLabel[7][0] = 0;
        testLabel[7][1] = 1;
        testLabel[8][0] = 0;
        testLabel[8][1] = 1;
        testLabel[9][0] = 0;
        testLabel[9][1] = 1;
        
        // create minibatches
        for (int i = 0; i < minibatchNumber; i++) {
            for (int j = 0; j < minibatchSize; j++) {
                trainSetMinibatch[i][j] = trainData[minibatchIndex.get(i * minibatchSize + j)];
                trainLabelMinibatch[i][j] = trainLabel[minibatchIndex.get(i * minibatchSize + j)];
            }
        }

        // Build Multi-Layer Perceptrons model
        MultiLayerPerceptron classifier = new MultiLayerPerceptron(nIn, nHidden, patterns, rng, Activation.Tanh);

        // train
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int batch = 0; batch < minibatchNumber; batch++) {
                classifier.train(trainSetMinibatch[batch], trainLabelMinibatch[batch], minibatchSize, learningRate);
            }
        }

        // test
        for (int i = 0; i < testSetSize; i++) {
            predictLabel[i] = classifier.predict(testData[i]);
            System.out.println("predict[" + i + "][0]:" + predictLabel[i][0] + ", predict[" + i + "][1]:" + predictLabel[i][1]);
        }

        // Evaluate the model
        Evaluation evaluation = new Evaluation(predictLabel, testLabel).fit();
        double accuracy = evaluation.getAccuracy();
        double[] precision = evaluation.getPrecision();
        double[] recall = evaluation.getRecall();

        System.out.println("MLP model evaluation");
        System.out.println("--------------------");
        System.out.printf("Accuracy: %.1f %%\n", accuracy * 100);
        System.out.println("Precision:");
        for (int i = 0; i < patterns; i++) {
            System.out.printf(" class %d: %.1f %%\n", i + 1, precision[i] * 100);
        }
        System.out.println("Recall:");
        for (int i = 0; i < patterns; i++) {
            System.out.printf(" class %d: %.1f %%\n", i + 1, recall[i] * 100);
        }
    }
}
