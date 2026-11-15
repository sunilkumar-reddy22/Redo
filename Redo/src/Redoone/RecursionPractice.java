package Redoone;

public class RecursionPractice {
    public static void main(String[] args) {
      //  message();
        print1(1);

    }
    static void message(){
            System.out.println("hey sunil");
            message1();
    }
    static void message1() {
        System.out.println("hey sunil");
        message2();
    }
    static void message2() {
        System.out.println("hey sunil");
        message3();
    }
    static void message3() {
        System.out.println("hey sunil");
        message4();
    }
    static void message4() {
        System.out.println("hey sunil");
    }
    static void print1(int n) {
        if (n == 20) {
            System.out.println(n);
            return;
        }
        System.out.print(n + "," + "");
        print1(n + 1);
    }
}
//its executing every block of code and calling function and going and printing and lastly it returns where it called from and lastly it reaches to main function and diconnect.