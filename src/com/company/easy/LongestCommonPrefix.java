package com.company.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));

        String[] strs2 = {"aaa","bbbb","ccc"};
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        //
        List<String> a = Arrays.stream(strs).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        String min = a.get(0);

        a.remove(0);

        return "";
    }
}
