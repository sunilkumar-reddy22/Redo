package RedoTwo;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
         reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
   public static void reverse(int [] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }
    }
}
