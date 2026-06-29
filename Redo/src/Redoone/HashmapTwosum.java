package Redoone;
import java.util.Arrays;
import java.util.HashMap;
public class HashmapTwosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;
      int [] ans =  find(nums,target);
      //  System.out.println(ans);
        System.out.println(Arrays.toString(ans));

    }
    static int [] find(int [] nums, int target) {
        //creating a Hashmap object.
        HashMap<Integer, Integer> map = new HashMap<>();
        //for  loop for tracking the array.
        for (int i = 0; i < nums.length; i++) {
            int prove = target - nums[i];
            if (map.containsKey(prove)) {
                //if found in the hashmap the  return the value of an index and current index through for loop i.
                return new int[]{map.get(prove), i};
            }
            //if not found then store the key + value
            map.put(nums[i], i);
        }
        //if not found return the empty array.
        return new int[]{};
    }
}
