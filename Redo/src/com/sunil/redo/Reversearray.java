package com.sunil.redo;
import java.util.Arrays;
public class Reversearray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
       int [] ans = reverse(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] reverse(int [] arr){
       int start = 0;
       int end = arr.length -1;
       while(start < end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       return arr;

    }
}
