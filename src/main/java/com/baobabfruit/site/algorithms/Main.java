package com.baobabfruit.site.algorithms;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Using the Euclidian algorithm the greatest shared devider between 10 and 45 is : "
                + euclidsAlgorithm.euclidianNumber(10,45));
        System.out.println("The answer to Euler.Net problem one is : "
                + eulerProblemOne(new int[]{3, 5},1000));
        System.out.println("The answer to Euler.Net problem two is : "
                + eulerProblemTwo(4_000_000));
    }

    public static int eulerProblemOne(int[] multiples, int lowerThenValue){
        ArrayList<Integer> listOfNaturalNumbers = eulerProblemOne.multiplesOfBelow(multiples,lowerThenValue);
        int answer = eulerProblemOne.sumOfArrayList(listOfNaturalNumbers);
        return answer;
    }

    public static int eulerProblemTwo(int max){
        ArrayList<Integer> fib = eulerProblemTwo.fibonacci(max);
        ArrayList<Integer> evenNumbers = eulerProblemTwo.extractEvenNumbers(fib);
        int answer = eulerProblemOne.sumOfArrayList(evenNumbers);
        return answer;
    }
}
