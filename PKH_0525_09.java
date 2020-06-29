import java.util.Scanner;

public class PKH_0525_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("년도를 입력하세요: ");
        year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("평년입니다.");
        }
    }
}