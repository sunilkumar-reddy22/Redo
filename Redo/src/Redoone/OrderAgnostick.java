package Redoone;

public class OrderAgnostick {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8};
        int target = 8;
      int ans =  search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        //Initializing Ascending or decending order;
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //descending order.
                if (nums[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;  //nums[mid] > target.
                }
            }
        }
        return -1;
    }
}