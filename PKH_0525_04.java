import java.util.Scanner;

public class PKH_0525_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = sc.nextInt();

        if (num != 0 && num % 5 == 0) {
            System.out.println("5�� ����Դϴ�.");
        } else {
            System.out.println("5�� ����� �ƴմϴ�.");
        }
    }
}