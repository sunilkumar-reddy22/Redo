package com.sunil.redo;
//minimum common value.
public class Mincommonval {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
       int ans = find(nums1, nums2);
        System.out.println(ans);
    }

    static int find(int[] nums1, int[] nums2) {
        //This is sorted array.
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
                //since this is an sorted non decereasing array in both sides we using comparing.
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;  //if not found any ans.
    }
}
