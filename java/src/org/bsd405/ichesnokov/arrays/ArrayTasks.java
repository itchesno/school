package org.bsd405.ichesnokov.arrays;

import java.util.Arrays;

public class ArrayTasks {
    public static int max(int[][] input) {
        int maxval = 0;

        for (int i = 0; i <= input.length - 1; i++) {
            for (int j = 0; j <= input[i].length - 1; j++) {
                if (maxval < input[i][j]) {
                    maxval = input[i][j];
                }
            }
        }
        return maxval;
    }

    // find element closest to average
    public static int median2(int[][] input) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input[j].length - 1; j++) {
                total += input[i][j];
                count += 1;
            }
        }
        double mean = total/count;
        int median = input[0][0];
        double minDistance = Math.abs(mean - input[0][0]);
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input[j].length - 1; j++) {
                double distance = Math.abs(mean - input[i][j]);
                if (distance < minDistance){
                    median = input[i][j];
                    minDistance = distance;
                }
            }
        }
        return median;
    }
}
