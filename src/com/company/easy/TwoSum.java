package com.company.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //

    public static void main(String[] args) {
        //
        int nums[] = {2,7,5,11};
        int number = 9;

        int[] output = TwoSum.output(nums,number);
        int[] output2 = TwoSum.output2(nums,number);
        System.out.println(Arrays.toString(output));


    }

    public static int[] output(int[] nums,int number) {

        for (int i =0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == number) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] output2(int[] nums,int number) {
        //
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = number - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("error");
    }
}
