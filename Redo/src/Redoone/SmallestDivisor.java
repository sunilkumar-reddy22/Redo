package Redoone;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {44, 22, 33, 11, 1};
        int threshold = 5;
      int ans =  Find(nums, threshold);
        System.out.println(ans);
    }

    static int Find(int[] nums, int threshold) {
        //minimum divisor woul be 1;
        int low = 1;
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            //we have found the space.
        }
        while (low < max) {
            //finding the mid value.
            int mid = low + (max - low) / 2;
            //mid is the divisor.
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) /mid;
            }
            if (sum > threshold) {
                //divisor is too small check on the right side.
                low = mid + 1;
            } else {
                max = mid;
            }
        }
        return max;
    }
}
