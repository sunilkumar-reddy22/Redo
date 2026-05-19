package com.sunil.redo;

public class Letter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';
        char ans = search(letters,target);
        System.out.println(ans);
    }

    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //finding the mid val.
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                //if mid is greater than target we go right to left to possible smallest greatest number that is end = mid -1;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}