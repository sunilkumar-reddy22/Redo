package Redoone;
import java.util.Arrays;
public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
     int ans =  sort(nums);
        System.out.println(ans);
    }

    static int sort(int[] nums) {
        //For array partition we need to sort the Arrays
        //because need to add the min num in pair without pair min number going  to be wasted.so we sort the elements.
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            //we need to skip 2steps in incrementing we are choosing even index.
            sum += nums[i];
        }
        return sum;
    }
}