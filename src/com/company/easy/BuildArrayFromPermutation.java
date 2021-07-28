package com.company.easy;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        //
        System.out.println(buildArray(new int[]{5,0,1,2,3,4}));
    }
    public static int[] buildArray(int[] nums) {
        //
        int[] result = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            result[j] = nums[nums[j]];
        }

        return result;
    }
}
