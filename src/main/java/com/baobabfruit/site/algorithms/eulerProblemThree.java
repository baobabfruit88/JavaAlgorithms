package com.baobabfruit.site.algorithms;

public class eulerProblemThree {

    /**
     * Finds the largest prime factor of given num
     * @param num
     * @return
     */
    //TODO This has to be optimized, alot.
    public static Long largestPrime(Long num){
        for (Long i = num -1; i > 0; i--) {
            if(num % i == 0) {
                if (isPrime(i)) {
                    return i;
                }
            }
        }
        throw new java.lang.RuntimeException("Given number is to low to have a prime factor.");
    }


    public static boolean isPrime(Long num){
        String number = String.valueOf(num);
        if(number.length() >= 2 ){
            if(number.endsWith("5")){
                return false;
            }
        }
        else if (num == 2){
            return true;
        }
        else if(num % 2 == 0){
            return false;
        }
        else{
            for (Long i = num -1; i > 2; i--) {
                if(num % i == 0){
                    return false;
                }
            }
            }
            return true;
        }
    }
