package RedoTwo;

public class OptFactors {
    public static void main(String[] args) {
        int n = 20;
        factor(n);
    }
    static void factor(int n){
        for(int i = 1; i <= Math.sqrt(n); i ++){
            if(n % i == 0){
                System.out.println(i + " " + n/i);
            }
        }
    }
}
