import java.util.Scanner;

public class PKH_0525_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int normal_price, price;
        double profit;

        System.out.print("������ �Է��ϼ���: ");
        normal_price = sc.nextInt();

        System.out.print("�ǸŰ��� �Է��ϼ���: ");
        price = sc.nextInt();

        profit = (price - normal_price) / normal_price * 100;

        System.out.printf("���ͷ� : %d%%\n", (int)profit);

        if (profit >= 30) {
            System.out.println("�ֻ��� �����Դϴ�.");
        } else {
            if (profit >= 20) {
                System.out.println("���� �����Դϴ�.");
            } else {
                if (profit >= 10) {
                    System.out.println("���� �����Դϴ�.");
                } else {
                    System.out.println("������ �����ϴ�..");
                }
            }
        }
    }
}