package com.baobabfruit.site.algorithms;

import org.junit.Test;
import org.junit.Assert;

public class euclidsAlgorithmTest {

    @Test
    public void euclidianNumberTest(){
        System.out.println("Testing the Euclidean algorithm");
        Assert.assertEquals(5,euclidsAlgorithm.euclidianNumber(10,45));
    }

}
