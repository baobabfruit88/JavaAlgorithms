package com.baobabfruit.site.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class eulerProblemTwoTest {


    @Test
    public void fibbonachiSequenceTest(){
        System.out.println("Testing Algorithm to test fibonacci sequence with elements lower then 10");
        ArrayList<Integer> fibbonachiModel = new ArrayList<>();
        fibbonachiModel.add(2);
        fibbonachiModel.add(3);
        fibbonachiModel.add(5);
        fibbonachiModel.add(8);

        ArrayList<Integer> fibonacci = eulerProblemTwo.fibonacci(10);
        Assert.assertEquals(fibbonachiModel,fibonacci);

    }

    @Test
    public void extractEvenNumbersTest(){
        System.out.println("Testing extraction of even numbers from list");
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbersList.add(i);
        }

        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        evenNumbersList.add(2);
        evenNumbersList.add(4);
        evenNumbersList.add(6);
        evenNumbersList.add(8);

        ArrayList<Integer> evenNumbers = eulerProblemTwo.extractEvenNumbers(numbersList);
        Assert.assertEquals(evenNumbersList,evenNumbers);
    }

}
