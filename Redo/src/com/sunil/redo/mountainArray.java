package com.sunil.redo;

public class mountainArray {
    public static void main(String[] args) {
        int[] nums = {0, 10, 0};
       int ans =  find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                //if mid < mid + 1 the start is mid + 1.going left to right.
                start = mid + 1;
            }
        }
        //return start or end because both pointers points to one element and that is ans.
        return start;
    }
}