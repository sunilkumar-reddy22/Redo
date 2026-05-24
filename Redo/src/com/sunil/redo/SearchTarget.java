package com.sunil.redo;

public class SearchTarget {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 8, 18, 20};  //target is 19,if not found return the gratest smallest elemnt. 20.
        int target = 19;
       int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end) { //forgot to add where to start and the length.
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //keep on checking left,to find better possibilities.
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}
