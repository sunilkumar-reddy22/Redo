package RedoTwo;

public class UniqueNumber {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,10,6,6};
        int ans = find(arr);
        System.out.println(ans);
    }
    static int find(int [] nums){
        int result = 0;
        for(int n :nums){
            result = result ^ n;
        }
        return result;
    }
}
