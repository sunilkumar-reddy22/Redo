package Redoone;
import java.util.Arrays;
public class Arraypermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
      int [] ans =  Find(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int []  Find(int[] nums) {
        //creating new empty array size of nums.
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]]; //Nested Indexing.
        }
        return ans;
    }
}
