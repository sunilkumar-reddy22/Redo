package RedoTwo;

public class NthMagicNumber {
    public static void main(String[] args) {
        int num = 10;
       int result = Find(num);
        System.out.println("You're magic number is " + result + "!");
    }
    static int Find(int num){
       int ans = 0;
       int base = 5;
       while(num > 0){
           //Extracting rightmost bit.
           int last = num & 1;
           num = num >> 1;
           ans = ans + base * last;
           base = base * 5;
       }
       return ans;
    }
}
