package com.baobabfruit.site.algorithms;

public class euclidsAlgorithm {
    public static int euclidianNumber(int a, int b){
        int bigNumber = (a > b) ? a : b;
        int smallNumber = (a > b) ? b : a;
        int largestCommonDivisor = 0;

        while (true) {
            int remainder = bigNumber % smallNumber;
            if(remainder > 0){
                bigNumber = smallNumber;
                smallNumber = remainder;
                largestCommonDivisor = remainder;
            }
            else {
                return largestCommonDivisor;
            }
        }
    }
}
