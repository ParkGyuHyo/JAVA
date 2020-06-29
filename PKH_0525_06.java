import java.util.Scanner;

public class PKH_0525_06 {
    public static void main(String[] args) {
        int num1, num2, hap, cha;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 1을 입력하세요: ");
        num1 = sc.nextInt();

        System.out.print("숫자 2를 입력하세요: ");
        num2 = sc.nextInt();

        hap = num1 + num2;
        cha = num1 - num2;

        if (hap > cha) {
            System.out.println("합이 차보다 큽니다.");
        } else if (hap < cha) {
            System.out.println("차가 합보다 큽니다.");
        } else {
            System.out.println("차와 합이 같습니다.");
        }
    }
}