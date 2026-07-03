package Redoone;
import java.util.HashSet;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
       boolean ans = findDuplicate(nums);
        System.out.println(ans);
    }

    static boolean findDuplicate(int[] nums) {
        //Creating HashSet object.
        HashSet<Integer> set = new HashSet<Integer>();
        //Using enhanced for loop
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            //add key to HashSet
            set.add(num);
        }
        return false;
    }
}