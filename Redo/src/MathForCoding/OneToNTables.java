package MathForCoding;

public class OneToNTables {
    public static void main(String[] args) {
        int start = 2;
        int end = 5;
        tables(start,end);
    }
    static void tables(int start, int end){
        for(int i = start; i <= end; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }

    }
}
