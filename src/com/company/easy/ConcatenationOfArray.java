package com.company.easy;

public class ConcatenationOfArray {

    public static void main(String[] args) {

        for (int x:
        getConcatenation(new int[]{1,2,3})) {
            System.out.println(x);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        //
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            //
//            int foo = i % nums.length;
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }
        return result;
    }
}
