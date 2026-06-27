package Redoone;

public class mountainArray {
    public static void main(String[] args) {
        int[] nums = {2,1};
       int ans = search(nums);
        System.out.println(ans);
    }

    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else { // nums[mid] < nums[mid + 1]
                start = mid + 1;
            }
        }
        return start;
    }
}