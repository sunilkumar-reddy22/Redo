package com.sunil.redo;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
       int [] ans = sum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] sum(int [] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1]; // here this minus current number and it does prefix sum using same array.
        }
        return nums;
    }
}
