package RedoThree;

public class PowerOfNumber {
    public static void main(String[] args) {
        int ans = 1;
        int power = 5;
        int base = 2;
       int result = Findpower(ans,power,base);
        System.out.println(result);
    }
    static int Findpower(int ans ,int power,int base){
        while(power > 0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;

        }
        return ans;
    }
}
