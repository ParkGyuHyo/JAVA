import java.util.Scanner;

public class PKH_0525_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = sc.nextInt();

        if (num != 0 && num % 5 == 0 && num % 2 == 0) {
            System.out.println("5�� ����̸鼭 ¦���Դϴ�.");
        } else {
            System.out.println("�ƴմϴ�.");
        }
    }
}