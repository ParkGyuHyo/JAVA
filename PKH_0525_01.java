import java.util.Scanner;

public class PKH_0525_01 {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("����1�� �Է����ּ���: ");
        num1 = sc.nextInt();
        
        System.out.print("����2�� �Է����ּ���: ");
        num2 = sc.nextInt();
        
        System.out.printf("�� : %d\n", num1+num2);
        System.out.printf("�� : %d", num1-num2);
    }
}