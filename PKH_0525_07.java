import java.util.Scanner;

public class PKH_0525_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt, price;
        double total;

        System.out.print("��ǰ�� ������ �Է��ϼ���: ");
        cnt = sc.nextInt();

        System.out.print("��ǰ�� �ܰ��� �Է��ϼ���: ");
        price = sc.nextInt();

        total = cnt * price;

        if (cnt >= 20) {
            total *= 0.8;
        } else {
            if (cnt >= 10) {
                total *= 0.9;
            }
        }

        System.out.printf("�ݾ� : %d��", (int)total);
    }
}