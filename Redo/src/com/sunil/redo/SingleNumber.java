package com.sunil.redo;
//Binary operators.
public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
      int ans = Prove(nums);
        System.out.println(ans);
    }
    static int Prove(int [] nums) {
        int result = 0;
        //using enhanced for loop.
        for (int num : nums) {
            result = result ^ num;    //It gives single value and removes duplicates automatically in cpu by logic gates.
        }
        return result;
    }

}
