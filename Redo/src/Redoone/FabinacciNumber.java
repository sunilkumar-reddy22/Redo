package Redoone;
import java.util.Scanner;
public class FabinacciNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Find(num);
     // System.out.println(ans);
    }
    static int Find(Scanner num){
        int n = num.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= n){
            int temp = i;
            i = i + p; // next element is updated and now update the previous element.
            p = temp;
            count++;
            System.out.println(i);
        }
      // System.out.println(i);
        return i;
    }
}
