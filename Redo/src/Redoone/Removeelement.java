package Redoone;
import java.util.Arrays;
public class Removeelement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeVal(arr, val));
        System.out.println(Arrays.toString(arr));
    }

    static int removeVal(int[] arr, int val) {
        //initializing the K to track arr != val and to store the unique elements in the k value;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            //condition if arr[i] != val
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}