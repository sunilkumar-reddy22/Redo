package com.sunil.redo;

public class TargetNum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 8, 9, 10, 12, 14, 18};
        int target = 12;
      int ans =  search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}