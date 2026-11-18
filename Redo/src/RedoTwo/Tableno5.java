package RedoTwo;

public class Tableno5 {
    public static void main(String[] args) {
        int n = 5;
        table(n);
    }
    static void table(int n){
        if(n < 1){
            System.out.println("Nope!Pls choose from 1 to n..1");
            return;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
