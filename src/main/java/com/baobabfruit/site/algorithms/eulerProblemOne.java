package com.baobabfruit.site.algorithms;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class eulerProblemOne {
    /**
     * Function takes a list of multiples and a value "below value"
     * Returns an ArrayList of all natural numbers that are multiples of given list below the given below value.
     *
     * @param multipleList
     * @param belowValue
     * @return
     */
    public static ArrayList<Integer> multiplesOfBelow(int[] multipleList, int belowValue){
        ArrayList<Integer> returnValues = new ArrayList<Integer>();
        for (int a:multipleList
        ) {
            for (int i = 1; i < belowValue; i++) {
                if(i % a == 0){
                    if(!returnValues.contains(i)) {
                        returnValues.add(i);
                    }
                }
            }
        }
        return returnValues;
    }
    public static int sumOfArrayList(ArrayList<Integer> multiples){
        int sum = multiples.stream().collect(Collectors.summingInt(Integer::intValue));
        return sum;
    }
}
