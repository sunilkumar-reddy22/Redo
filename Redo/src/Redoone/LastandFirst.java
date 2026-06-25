package Redoone;
import java.util.Arrays;
public class LastandFirst {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7};
        int target = 7;
        //return 1,4.
        //return the target value first and last index.
        int [] result = {Firstsearch(nums,target),Lastsearch(nums,target)};
        System.out.println(Arrays.toString(result));
    }

    static int Firstsearch(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                //store the ans;
                ans = mid;
                //check for the better possibilities in the left side of the array.
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int Lastsearch(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                //store the ans;
                ans = mid;
                //check for the better possibilities in the left side of the array.
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }
}