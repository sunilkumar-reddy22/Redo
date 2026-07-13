package Redoone;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5}; //This array is sorted we need to write best case secenerio.
      int [] ans =  Sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] Sort(int [] nums){
        //declaring boolean
        boolean swapped;
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 0; j < nums.length -i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    //if condition is true and now swapping happens here.
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;//if it swaps then swapped is true.
                }
            }
            if(!swapped);
            break;
        }
       return nums;
    }
}
