package com.sunil.redo;
//count postive and negative numbers
public class CountpostiveNeg {
    public static void main(String[] args) {
        //Array of integers.
        int[] nums = {-1, -2, -3, 3, 2, 1,4};
     int ans = count(nums);
        System.out.println(ans);
    }

    static int count(int[] nums) {
        //for negative number if the number is less than 0 it is negative 0 not count.
        int negative = 0;
        int postive = 0;
        for (int num : nums) {
            if (num < 0) {
                negative++;
            } else if (num > 0) {
                postive++;
            }
            //now return the biggest number among them.
           // return Math.max(postive, negative);
        }
        return Math.max(postive, negative);
    }
}
