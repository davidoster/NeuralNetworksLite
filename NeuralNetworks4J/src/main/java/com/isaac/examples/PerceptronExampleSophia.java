package com.isaac.examples;

import com.isaac.neuralnetworks.Perceptron;

public class PerceptronExampleSophia {

    public static void main(String[] args) {
        // Declare variables and constants for perceptrons
        final int trainSetSize = 22; // number of training data
        final int testSetSize = 10; // number of test data
        final int nIn = 4; // dimensions of input data

        //double[][] trainSet = new double[trainSetSize][nIn]; // input data for training
        double[][] trainData = new double[trainSetSize][nIn]; // input data for training

        // dates are from 1/1/20 - 22/1/20
        // trainData[i][0] = date
        // trainData[i][1] = scale
        // trainData[i][2] = temperature
        // trainData[i][3] = humidity
        
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


        int[] trainLabel = new int[trainSetSize]; // output data (label) for training
        
        // label with value 1 is sygkomidh data
        // label with value 0 is trygos data
        trainLabel[0] = 1;
        trainLabel[1] = 1;
        trainLabel[2] = 1;
        trainLabel[3] = 1;
        trainLabel[4] = 1;
        trainLabel[5] = 1;
        trainLabel[6] = 1;
        trainLabel[7] = 1;
        trainLabel[8] = 1;
        trainLabel[9] = 1;
        trainLabel[10] = 1;
        trainLabel[11] = 1;
        trainLabel[12] = 1;
        trainLabel[13] = 0;
        trainLabel[14] = 1;
        trainLabel[15] = 1;
        trainLabel[16] = 1;
        trainLabel[17] = 1;
        trainLabel[18] = 1;
        trainLabel[19] = 1;
        trainLabel[20] = 1;
        trainLabel[21] = 1;
        
        double[][] testData = new double[testSetSize][nIn]; // input data for test

        testData[0][0] = 2121.0;
        testData[0][1] = 40.480;
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
        testData[4][1] = 44.050;
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


        int[] testLabel = new int[testSetSize]; // label of inputs

        testLabel[0] = 1;
        testLabel[1] = 1;
        testLabel[2] = 1;
        testLabel[3] = 1;
        testLabel[4] = 1;
        testLabel[5] = -1; // was 0 for trygos
        testLabel[6] = 1;
        testLabel[7] = 1;
        testLabel[8] = 1;
        testLabel[9] = 1;

        int[] predictLabel = new int[testSetSize]; // output data predicted by the model

        final int epochs = 900000; // maximum training epochs
        final double learningRate = 1.0; // learning rate can be set as 1 in perceptrons

        // Build Single Layer Neural Networks Model
        Perceptron classifier = new Perceptron(nIn); // construct perceptrons

        // train models
        int epoch = 0; // training epochs
        while (epoch <= epochs) {
            int classified = 0;
            for (int i = 0; i < trainSetSize; i++) {
                classified += classifier.train(trainData[i], trainLabel[i], learningRate);
            }
            if (classified == trainSetSize) {
                System.out.println("Did break on epoch: " + epoch);
                break;
            } // when all data classified correctly
            epoch++;
        }

        // test
        for (int i = 0; i < testSetSize; i++) {
            predictLabel[i] = classifier.predict(testData[i]);
        }

        // Evaluate the model
        int[][] confusionMatrix = new int[2][2];
//        System.out.println("c[0][0] = "+confusionMatrix[0][0]);
        double accuracy = 0.0;
        double precision = 0.0;
        double recall = 0.0;
        for (int i = 0; i < testSetSize; i++) {
            if (predictLabel[i] > 0) {
                if (testLabel[i] > 0) {
                    accuracy += 1;
                    precision += 1;
                    recall += 1;
                    confusionMatrix[0][0] += 1;
                } else {
                    confusionMatrix[1][0] += 1;
                }
            } else {
                if (testLabel[i] > 0) {
                    confusionMatrix[0][1] += 1;
                } else {
                    accuracy += 1;
                    confusionMatrix[1][1] += 1;
                }
            }
        }

        accuracy /= testSetSize;
        precision /= confusionMatrix[0][0] + confusionMatrix[1][0];
        recall /= confusionMatrix[0][0] + confusionMatrix[0][1];

        System.out.println(String.format("Perceptrons model evaluation:\n"
                + "Accuracy: %.1f\nPrecision: %.1f\nRecall: %.1f", accuracy * 100,
                precision * 100, recall * 100));
        System.out.println("----------------------");
        for (int i = 0; i < classifier.getW().length; i++) {
            System.out.print(classifier.getW()[i] + "\t");
        }
    }

}
