package com.company.easy;

public class PalindromeNumber {
    //
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        //
        if (x < 0) {
            return false;
        }
        int result = 0;
        int num = x;

        while(true) {
            //
            result = result * 10 + num % 10;
            num /= 10 ;

            if (num==0) {
                return result == x;
            }
        }

    }
}
