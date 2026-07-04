package Redoone;

public class ConsectiveArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 1};
      int ans =  find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0; //resets o
            }
        }
        return max;
    }
}