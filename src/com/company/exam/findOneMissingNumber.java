package com.company.exam;

public class findOneMissingNumber {
    //
    public static void main(String[] args) {
        //
        System.out.println(findNumber(new int[]{3,7,1,2,8,5,6,9}));
    }

    public static int findNumber(int[] arr) {
        //
        int totalNumber = ((arr.length+1) * (arr.length + 2))/2;

        for (int i = 0; i<arr.length; i++) {
            //
            totalNumber -= arr[i];
        }

        return totalNumber;
    }
}
