package RedoTwo;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 20;
        Factors(num);
    }

    static void Factors(int n) {
        for (int i = 1; i < n; i++)
            if (n % i == 0) {
                System.out.print(i + " ");
            }
    }
}