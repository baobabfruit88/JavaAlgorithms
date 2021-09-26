package com.baobabfruit.site.algorithms;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println(euclidsAlgorithm.euclidianNumber(10,45));
        System.out.println(EulerProblem1(new int[]{3, 5},1000));
    }

    public static int EulerProblem1(int[] multiples, int lowerThenValue){
        ArrayList<Integer> listOfNaturalNumbers = eulerProblemOne.multiplesOfBelow(multiples,lowerThenValue);
        int summedList = eulerProblemOne.sumOfArrayList(listOfNaturalNumbers);
        return summedList;
    }
}
