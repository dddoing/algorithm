package com.company.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    //
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        //
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        char[] foo = s.toCharArray();
        int result = 0;

        for (int i = 0; i < foo.length; i++) {
            //
            int num = roman.get(foo[i]);
            int inx = 0;

            if(foo.length > i +1) {
                //
                inx = roman.get(foo[i+1]);
            }

            if (inx>num) {
                i += 1;
                result = result + inx-num;
            } else {
                result += num;
            }

        }

        return result;
    }
}
