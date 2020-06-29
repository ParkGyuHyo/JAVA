public class PKH_0601_08 {
    public static void main(String[] args) {
        int number;

        number = 100;

        myPrint("hello World!!");
        myPrint(number);
    }

    static void myPrint(String str) {
        System.out.println("myPrint(String str) 메서드");
        System.out.println(str);
    }

    static void myPrint(int num) {
        System.out.println("myPrint(int num) 메서드");
        System.out.println(num);
    }
}