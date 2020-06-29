import java.util.Scanner;

public class PKH_0525_01 {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("숫자1을 입력해주세요: ");
        num1 = sc.nextInt();
        
        System.out.print("숫자2을 입력해주세요: ");
        num2 = sc.nextInt();
        
        System.out.printf("합 : %d\n", num1+num2);
        System.out.printf("차 : %d", num1-num2);
    }
}