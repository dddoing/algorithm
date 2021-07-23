package com.company.easy;

import java.util.Arrays;

public class ReverseNum {

    public static void main(String args[]) {
        //
        int result = ReverseNum.reverse(-123);
        System.out.println(result);
    }

    public static int reverse(int number) {
        //
        String ans = number < 0 ? new StringBuilder(String.valueOf(-number)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(number)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}
