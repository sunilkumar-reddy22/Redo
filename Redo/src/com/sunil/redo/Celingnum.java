package com.sunil.redo;

public class Celingnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 7, 10, 12, 13, 17};
        int target = 14;
        //if not ans found return-1.
      int ans =  search(arr, target);
        System.out.println(ans);
    }

    static  int search(int[] nums, int target) {
        //it is sorted array,starts with left 0 and checks last number.
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //we are  targeting 15,which is not in the in the arrays.
            if (nums[mid] == target) {
                return mid;
                //if val found return the mid.
            } else if (nums[mid] < target) {

                start = mid + 1;
            } else {
            ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
