package com.baobabfruit.site.algorithms;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class eulerProblemOneTest {
    @Test
    public void listOfMultiplesBelowTest(){
        System.out.println("Testing Algorithm for Euler problem one");
        ArrayList<Integer> validationList = new ArrayList<>();
        validationList.add(3);
        validationList.add(6);
        validationList.add(9);
        validationList.add(5);

        int[] multiples = new int[]{3, 5};
        ArrayList<Integer> listOfNaturalNumbers = eulerProblemOne.multiplesOfBelow(multiples, 10);
        assertEquals(validationList, listOfNaturalNumbers);
    }

    @Test
    public void sumOfArrayListTest(){
        System.out.println("Testing to sum an array list");
        int[] multiples = new int[]{3, 5};
        ArrayList<Integer> listOfNaturalNumbers = eulerProblemOne.multiplesOfBelow(multiples, 10);
        int summedList = eulerProblemOne.sumOfArrayList(listOfNaturalNumbers);
        assertEquals(23,summedList);
    }
}
