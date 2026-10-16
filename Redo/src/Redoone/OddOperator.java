package Redoone;

public class OddOperator {
    public static void main(String[] args) {
        int n = 77;
        System.out.println(Find(n));
    }
    static boolean Find(int n){
        return (n &  1) == 1;
    }
}
