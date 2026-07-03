package Redoone;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
       int ans = find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}