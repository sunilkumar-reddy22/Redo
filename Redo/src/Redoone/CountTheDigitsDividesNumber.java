package Redoone;

public class CountTheDigitsDividesNumber {
    public static void main(String[] args) {
        int num = 224;
       int result = Find(num);
       System.out.println(result);
    }
    static int Find(int num){
        int count = 0;
        int original = num;
        while(num > 0){
            int val = 0;
            val = num % 10; //Takes last digit and stores in the val
            //condition
            if(original % val == 0){
                count++;
            }
            num = num / 10; //Im using num as start to break the loop.
        }
        return count;
    }
}
