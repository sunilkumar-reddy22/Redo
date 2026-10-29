package RedoThree;

public class NthmagicNumber {
    public static void main(String[] args) {
        int n = 20;
        int ans = MagicNum(n);
        System.out.println("nth magic number is " + ans + "!");
    }
    static int MagicNum(int magic){
        int base = 5;
        int ans = 0;
        while(magic > 0){
            int last = magic & 1;
            magic = magic >> 1;
            ans = ans + last * base;
            base = base * 5;

        }
        return ans;
    }

}
