package com.sunil.redo;
import java.util.HashSet;
public class FindDyuplicattes {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(find(nums));
    }

    static int find(int[] nums) {
        // going with hashset,cause it is asking to return duplicate number no index num.
        HashSet<Integer> set = new HashSet<>();
        //search each element that are present in array.
        for (int num : nums) {
            //if condition,if item available return it.
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
