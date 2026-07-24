package Redoone;
import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {4,5,3,2,1};
       int [] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] Sort(int [] nums){
        //let i be = 0 cause we are checking from the 0th index.
        int i = 0;
        while(i < nums.length){
            //create index value validater.
            int correct = nums[i] -1;
            //if the current index is not = correct index value then swap it.
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++; //if found correct values then skip the swap and go forward
            }

        }
        return nums;
    }
    static void swap(int [] nums,int start,int second){
        int temp = nums[start];
        nums[start] = nums[second];
        nums[second] = temp;
    }

}
