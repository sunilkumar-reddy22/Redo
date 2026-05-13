package com.sunil.redo;
import java.util.HashSet;
public class Containsduplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
      boolean ans =  find(nums);
        System.out.println(ans);
    }

    static boolean find(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}