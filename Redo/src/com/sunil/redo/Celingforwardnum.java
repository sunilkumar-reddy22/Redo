package com.sunil.redo;

public class Celingforwardnum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 7, 10, 12, 14, 15, 18};
        int target = 16; //16 is not in the array,so we need to return greater than given element.
     int ans =  search(nums, target); //ans = 10 index
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        //starting from 0 ot end.
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        //finding mid.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //if mid is the ans return mid
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                //if mid is greater than target the save mid = target because we need to return if not found tha target return greater val of its
                //so this might be the ans.
                //however we check last possible.
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}



