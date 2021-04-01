package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(125));

        System.out.println(divide(25, 5));

    }

    public static boolean isPalindrome(int number) {
        int palindromeNumber = number;
        int reverseNumber = 0;

        while (palindromeNumber != 0) {
            int remainder = palindromeNumber % 10;//5
            reverseNumber = reverseNumber * 10 + remainder;
            palindromeNumber /= 10;
        }

        if (number == reverseNumber) {
            return true;
        }
        return false;
    }


    public static int divide(int dividend, int divisor) {
        
        int count = 0;
        for (int i = dividend - divisor; i >= 0; i -= divisor) {

            if (i < 0)
                break;
            else
                count++;
        }
        return count;
    }
}