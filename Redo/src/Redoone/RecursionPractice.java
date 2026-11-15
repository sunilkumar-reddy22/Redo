package Redoone;

public class RecursionPractice {
    public static void main(String[] args) {
        message();

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
}
//its executing every block of code and calling function and going and printing and lastly it returns where it called from and lastly it reaches to main function and diconnect.