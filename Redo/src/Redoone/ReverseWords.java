package Redoone;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
       String ans = Reverse(s);
        System.out.println(ans);
    }
    static String Reverse(String s){
        //We need to store this in string array to seperate the indexs.
        String [] words  = s.trim().split("\\s+"); //we stored in the array.
        //Creating string builder to read the values and accesing to methods.
        StringBuilder sb = new StringBuilder();
        //Now we need to traverse the string array from reverse.
        for(int i = words.length -1; i >= 0; i--){
            sb.append(words[i]);
            if( i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}
