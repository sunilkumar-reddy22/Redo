package Redoone;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
      List<Integer> ans =  Sprial(matrix);
      //  System.out.println(Arrays.toString(ans));
        System.out.println(ans);
    }

    static List<Integer> Sprial(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //initializing Rows and Column.
        int top = 0; //First row.
        int left = 0; //starting column;
        int right = matrix[0].length -1; //left column.
        int bottom = matrix.length - 1; //last row;

        //while loop checking Rows and column and traversing.
        //1st column loop
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            //2nd loop for last column
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            //3rd loop for last row.
            //check last row is available or not.
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }

                bottom--;
            }
            //4th loop to check last column;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }

                left++; //close the left column;
            }
        }
        return list;
    }
}