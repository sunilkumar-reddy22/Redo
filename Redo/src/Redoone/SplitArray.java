package Redoone;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
      int ans =  Sprial(nums, k);
        System.out.println(ans);
    }

    static int Sprial(int[] nums, int k) {
        //Initializing the variables.
        int start = 0;
        int end = 0;
        //creating for each loop for finding maximum num in the array and sum of num.
        for (int i = 0; i < nums.length; i++) {
            //Using Math.max function to getting max value.
            start = Math.max(start, nums[i]);
            //Finding the sum of array.
            end += nums[i]; //where as end = end + nums[i].
        }
        //Binary Search.
        //To find the subarrays via using binary search.
        while (start < end) {  //Here start == end.
            //Finding the mid value.
            int mid = start + (end - start) / 2;
            //Initialize sum variable to store subarray.
            int sum = 0;
            //Initializing the pieces minimum 1
            int pieces = 1;
            //creating for each loop to traverse the sum of value is exceeding or not.
            for (int num : nums) {
                if (sum + num > mid) {
                    //if condition is true then array splits and need to store
                    //The current num is going to new sum.
                    sum = num;
                    pieces++;
                } else {
                    //store the progress sum of array.
                    sum += num;
                }
            }
            //if pieces is more than k that means the size is small
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid; //try searching lower mid.
            }
        }
        return start;
    }
}

