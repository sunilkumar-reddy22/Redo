package Redoone;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int ans = user(input);
        System.out.println(ans);
    }

    static int user(Scanner input) {
        int ans = input.nextInt();
        return ans;
    }
}
