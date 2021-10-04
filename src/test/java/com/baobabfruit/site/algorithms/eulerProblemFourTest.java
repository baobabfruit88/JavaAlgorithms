package com.baobabfruit.site.algorithms;


import org.junit.Assert;
import org.junit.Test;

public class eulerProblemFourTest {
    @Test
    public void isPalindromeTest(){
        Assert.assertEquals(true,eulerProblemFour.isPalindrome(9009));
    }
    @Test
    public void reverseIntTest(){
        Assert.assertEquals("shakespeare",eulerProblemFour.stringReverse("eraepsekahs"));
    }
    @Test
    public void largestPalindromeOfProductTest(){
        Assert.assertEquals(9009,eulerProblemFour.largestPalindromeOfProduct(99,99));
    }
}
