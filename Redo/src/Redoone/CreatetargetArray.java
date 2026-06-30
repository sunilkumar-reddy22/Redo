package Redoone;
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.ArrayList;
import java.util.Arrays;
public class CreatetargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
       int [] ans = Create(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Create(int[] nums, int[] index) {
        //now create an arraylist object.
        ArrayList<Integer> list = new ArrayList<>();
        //generate a for loop to read nums to index;
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        //now create new empty array size of nums.length;
        int[] target = new int[nums.length];
        //generate a for loop to store the values in new target array.
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
