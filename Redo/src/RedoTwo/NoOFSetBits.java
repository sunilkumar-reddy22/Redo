package RedoTwo;

public class NoOFSetBits {
    public static void main(String[] args) {
        int num =  20;
        System.out.println(Integer.toBinaryString(num));
        int ans = find(num);
        System.out.println(ans);
    }
    static int find(int num){
        int count = 0;
        while(num > 0){
            num = num -(num & -num);
            count++;
        }
        return count;
    }
}
