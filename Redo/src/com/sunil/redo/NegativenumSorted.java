package com.sunil.redo;

public class NegativenumSorted {
    public static void main(String[] args) {
        int [][] grid = {
                {4, 3, 2, -1},               //The array is sorted in non desending order go through first row last col if col is > the value
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
       int ans = matrix(grid);
        System.out.println(ans);
    }
    static int matrix(int [] [] grid){
       int m = grid.length;
       int n = grid[0].length;
       int row = 0;
       int col = n -1;
       int count = 0;
       while(row <m && col >= 0) {
           if (grid[row][col] < 0) {
               count += (m - row);
               col--;
           }
           else {
               row++;
           }
       }
       return count;
    }
}
