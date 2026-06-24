package com.sunil.redo;

public class Letters {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
      char ans =  find(letters, target);
        System.out.println(ans);
    }

    static char find(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                //means mid should go to right left
                end = mid - 1;
            } else {
                //iftarget > mid then start = mid +1;
                start = mid + 1;
            }
        }
       return letters[start % letters.length];
    }
}