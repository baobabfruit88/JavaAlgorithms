package com.baobabfruit.site.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class eulerProblemThreeTest {
    @Test
    public void isPrimeTest(){
        System.out.println("Testing if given number is prime");
        Assert.assertEquals(true,eulerProblemThree.isPrime(2L));
    }
    @Test
    public void isLargestPrime(){
        System.out.println("Testing if the largest prime factor by which num is divisible is returned");

        Assert.assertEquals(5,eulerProblemThree.largestPrime(10L).intValue());
    }
}
