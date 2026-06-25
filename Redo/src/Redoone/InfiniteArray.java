package Redoone;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18};
        int target = 10;
      int ans =  Search(nums, target);
        System.out.println(ans);
    }

    static int Search(int[] nums, int target) {
        int start = 0;
        int end = 1;
            while (target > nums[end]) {
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                if(end >= nums.length) {
                    end = nums.length - 1;
                }
                start = newStart;
            }

        return ans(nums, target, start, end);
    }

    static int ans(int[] nums, int target, int start, int end) {
        // we found the size of the window now  we're doing normal binary search.
        while (start <= end) {
            //find the mid value in the window.
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}