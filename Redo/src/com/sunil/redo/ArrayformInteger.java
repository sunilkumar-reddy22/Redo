package com.sunil.redo;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayformInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
      List<Integer> ans =  ArrayInteger(num, k);
        System.out.println(ans);
    }

    static List<Integer> ArrayInteger(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        //initializing num indices
        int i = num.length - 1;
        while (i >= 0 || k > 0) {     //checking how many arrays are left.  // here k>= 0 loops forever remove =
            if (i >= 0) {
                k = k + num[i];
                i--;
            }
            result.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(result);
        return result;
    }
}



