package RedoThree;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 5;
        Target(nums,target);
    }
    static void Target(int [] nums,int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start +(end - start) /2;
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }

        }
    }
}