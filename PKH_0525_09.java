import java.util.Scanner;

public class PKH_0525_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("�⵵�� �Է��ϼ���: ");
        year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("�����Դϴ�.");
        } else {
            System.out.println("����Դϴ�.");
        }
    }
}