import java.util.Scanner;

public class PKH_0525_06 {
    public static void main(String[] args) {
        int num1, num2, hap, cha;
        Scanner sc = new Scanner(System.in);

        System.out.print("���� 1�� �Է��ϼ���: ");
        num1 = sc.nextInt();

        System.out.print("���� 2�� �Է��ϼ���: ");
        num2 = sc.nextInt();

        hap = num1 + num2;
        cha = num1 - num2;

        if (hap > cha) {
            System.out.println("���� ������ Ů�ϴ�.");
        } else if (hap < cha) {
            System.out.println("���� �պ��� Ů�ϴ�.");
        } else {
            System.out.println("���� ���� �����ϴ�.");
        }
    }
}