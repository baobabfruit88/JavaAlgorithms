package com.baobabfruit.site.algorithms;

public class eulerProblemFour {

    /**
     * A palindromic number reads the same both ways.
     * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     *
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * @param productA
     * @param productB
     * @return
     */
    public static int largestPalindromeOfProduct(int productA, int productB){
        int palindrome = 0;
        for (int i = productA; i > 0; i--) {
            for (int j = productB; j > 0 ; j--) {
                int testPalindrome = i * j;
                if (isPalindrome(testPalindrome)) {
                    if (palindrome < testPalindrome) {
                        palindrome = testPalindrome;
                    }
                }
            }
        }
        return palindrome;
    }

    public static boolean isPalindrome(int possiblePalindrome){
        String palindrome = String.valueOf(possiblePalindrome);
        return palindrome.equals(stringReverse(palindrome));
    }

    public static String stringReverse(String subject){
        StringBuilder builder = new StringBuilder(subject);
        builder.reverse();
        subject = builder.toString();
        return subject;
    }
}
