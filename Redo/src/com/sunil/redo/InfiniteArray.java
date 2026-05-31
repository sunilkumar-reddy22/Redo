package com.sunil.redo;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 8, 9, 20};
        int target = 5;  //output = 6
        //we need to return element 8 index.
       int ans = find(nums, target);
        System.out.println(ans);
    }

    //firs function
    static int find(int[] nums, int target) {
        //since we don't know the size of the array,we start from the size 2.
        int start = 0;
        int end = 1;
        //Target should be greater than end.if in case target is located in last for checking it goes until it finds the target.
        while (target > nums[end]) {
            int newStart = end + 1;
            //double the size of previos.
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(nums, target, start, end);
    }

    static int search(int[] nums, int target, int start, int end) {
        //we found the size of the window,we are using regular binary search.
        while (start <= end) {
            int mid = start + (end - start + 1) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //if not found the value. return -
        return -1;
    }
}