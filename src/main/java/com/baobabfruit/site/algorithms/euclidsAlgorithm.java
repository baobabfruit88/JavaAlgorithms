package com.baobabfruit.site.algorithms;

public class euclidsAlgorithm {
    /**
     * Given two integers, Euclid's algorithm will find its greatest common divisor, that has no remains.
     * @param numA integer
     * @param numB integer
     * @return
     */
    public static int euclidianNumber(int numA, int numB){
        int bigNumber = (numA > numB) ? numA : numB;
        int smallNumber = (numA > numB) ? numB : numA;
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
