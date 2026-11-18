package MathForCoding;

public class Fractions {
    public static void main(String[] args) {
        int x = -2;
        find(x);
    }
    static void find(int x){
        int a = x;
        if(a < 0){
            a = -a;
            System.out.println(a);
        }
    }
}
