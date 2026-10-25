package RedoTwo;

public class BitwiseevenOrodd {
    public static void main(String[] args) {
        int n = 4;
       boolean result = Find(n);
        System.out.println(result);
    }
    static boolean Find(int n){
        if((n & 1) == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
