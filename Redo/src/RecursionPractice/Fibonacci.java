package RecursionPractice;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 4;
       int ans = fibo(num);
        System.out.println(ans);
    }
    static int fibo(int num){
        if(num < 2){
            return num;
        }
        return fibo(num -1) + fibo(num -2);
    }
}
