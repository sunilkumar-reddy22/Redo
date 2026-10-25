package RedoThree;

public class EvenOrOdd {
    public static void main(String[] args) {
        int nums = 65;
        boolean ans = IsOdd(nums);
        System.out.println(ans);
    }
    static boolean IsOdd(int nums){
        return ((nums & 1) == 1); //This expression gives us the number is odd or even with boolean not needed if else statements.
    }
}
