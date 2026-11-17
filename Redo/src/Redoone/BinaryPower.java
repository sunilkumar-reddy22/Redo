package Redoone;

public class BinaryPower {
    public static void main(String[] args) {
        int base = 3;
      int ans =  find(base);
        System.out.println(ans);
    }
    static int find(int base){
        int ans = 1;
        int power = 13;
        while(power > 0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            //increasing the base.
            base = base * base;
            //deleting each bit every rotation
             power = power >> 1;
        }
        return ans;
    }
}
