package com.sunil.redo;
import java.util.List;
import java.util.ArrayList;
public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},                     // target = { 1,2,3,,6,9,8,7,4,5}
                {4, 5, 6},
                {7, 8, 9}
        };
       List<Integer> ans = Sprial(matrix);    // I guess this list tye is we are storing in the list those data.
        System.out.println(ans);
    }

    static List<Integer> Sprial(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0; //first row.
        int right = matrix.length - 1;   //last col.
        int left = 0;                                    // first col.
        int bottom = matrix[0].length - 1;                   // last row. in the spiral array.
        while (top <= bottom && left <= right) {
            //first row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);               //here it takes the 5 through edge case
            }
            top++;                                            //now shrink the first row.
            //last col
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;                                                 //shrink the last col.

            if (top <= bottom) {                                  //checking is there any rows left we got 2rows left.
                for (int i = right; i >= bottom; i--) {            // the sprial going frombottom right to left.
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= left; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
  //took 30mins to solve,redo again and again in a repetition.