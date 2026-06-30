package Redoone;
import java.util.Arrays;
public class Removeduplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
      int ans =  removeduplicates(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    static int removeduplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}
