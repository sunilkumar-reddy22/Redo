package RedoTwo;

public class ThreeDivisors {
    public static void main(String[] args) {
        int num = 4;
       boolean ans = Find(num);
        System.out.println(ans);
    }
    static boolean Find(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }

        }
        return (count == 3);
    }
}
