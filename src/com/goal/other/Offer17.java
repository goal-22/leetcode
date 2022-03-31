package com.goal.other;

import java.util.Arrays;

public class Offer17 {

    public static int[] printNumbers(int n) {
        int i = (int) Math.pow(10, n);
        int[] res = new int[i - 1];
        if (n == 0) {
            return res;
        }

        for (int j = 0; j < i - 1; j++) {
            res[j] = j + 1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }

}
