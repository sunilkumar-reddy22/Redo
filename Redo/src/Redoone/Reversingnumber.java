package Redoone;

public class Reversingnumber {
    public static void main(String[] args) {
        int x = -123;
       int ans = reverse(x);
        System.out.println(ans);
    }
    static int reverse(int x){
    int result = 0;
    int sign = 1;
    //if x value is less than 0 then i convert negitive to positive.
    if(x < 0) {
         sign = -1;
        x = -x;
    }
    while(x > 0) {
        int rem = x % 10;
        //overflow
        if (result > Integer.MAX_VALUE / 10) {
            return 0;
        }
        result = result * 10 + rem;
        x = x /10;
    }
    return result * sign;

    }
}
