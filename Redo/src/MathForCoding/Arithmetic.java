package MathForCoding;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        add(a,b);
        subtract(a,b);
    }
    static void add(int a , int b){
        int sum = a + b;
        System.out.println(sum);
    }
    static void subtract(int a , int b){
        System.out.println(a-b);
    }
}
