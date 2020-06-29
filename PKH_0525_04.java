import java.util.Scanner;

public class PKH_0525_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (num != 0 && num % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("5의 배수가 아닙니다.");
        }
    }
}