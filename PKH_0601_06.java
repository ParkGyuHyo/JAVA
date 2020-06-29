public class PKH_0601_06 {
    public static void main(String[] args) {
        int number;

        number = 100;
        anotherNumber();

        System.out.println("main 메서드 출력");
        System.out.println(number);
    }

    static void anotherNumber() {
        int number;

        number = 200;

        System.out.println("anotherNumber 메서드 출력");
        System.out.println(number);
    }
}