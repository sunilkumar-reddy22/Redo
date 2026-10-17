package Redoone;

public class FindingUnique {
    public static void main(String[] args){
        //initializing array.
        int [] nums = {2,4,3,6,3,4,2};
       int ans = Find(nums);
        System.out.println(ans);
    }
    static int Find(int [] nums){
        int result = 0;
        for(int unique : nums){
            result =  unique ^ result;
        }
        return result;
    }
}
