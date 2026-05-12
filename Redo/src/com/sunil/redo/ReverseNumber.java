package com.sunil.redo;

public class ReverseNumber {
    public static void main(String[] args) {
        int nums = 23456;
       int ans = reverse(nums);
        System.out.println(ans);

    }
    static int reverse(int nums) {
        int result = 0;
        while (nums > 0) {
            int rem = nums % 10; //gives last integer.
            //removing last integer.
            nums = nums / 10;
           //saving the val
            result = result * 10 + rem;
        }
        return result;
    }
}
