package RecursionPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8};
        int target = 6; //needs to give 5.
      int ans =  search(arr, target,0,arr.length -1);
      System.out.println(ans);
    }
    static int search(int [] arr, int target , int s, int e ){
        if(s > e){
            return -1;
        }
        //initialize the mid value.
        int m = s +(e - s) /2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            //hence my answer lies on the left side,so i do end = mid -1.
            return search(arr, target, s , e -1);
        }
        return search(arr, target, s + 1 , e);
    }
}
