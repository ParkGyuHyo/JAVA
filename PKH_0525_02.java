import java.util.Scanner;

public class PKH_0525_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kw;
        double normal_price;
        double kw1_price;

        System.out.print("�⺻ ����� �Է��ϼ���: ");
        normal_price = sc.nextDouble();

        System.out.print("kw�� �����: ");
        kw1_price = sc.nextDouble();

        System.out.print("�����뷮�� �Է��ϼ���(kw): ");
        kw = sc.nextDouble();

        double total_price = normal_price + (kw * kw1_price);

        System.out.printf("�������� %f �� �Դϴ�.", total_price + (total_price * 0.09));
    }
}