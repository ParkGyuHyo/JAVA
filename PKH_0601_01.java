import java.util.Scanner;

public class PKH_0601_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        double hei, wei, biman, pyojun

        System.out.print("Ű�� �Է����ּ���: ")
        hei = sc.nextDouble();

        System.out.print("�����Ը� �Է����ּ���: ")
        wei = sc.nextDouble();

        if (hei >= 160) {
            pyojun = (hei - 100) * 0.9
        } else {
            if (hei >= 150) {
                pyojun = (hei - 150) /2 + 50
            } else {
                pyojun = hei - 100
            }
        }

        biman = (wei - pyojun) * 100.0 / pyojun;

        System.out.printf("ǥ�� ������ : %.2f\n�񸸵� : %.2f\n", pyojun, biman)
        System.out.println("================================")

        if (biman > 20) {
            System.out.println("���Դϴ�.")
        } else {
            if (biman >= 10) {
                System.out.println("��ü���Դϴ�.")
            } else {
                System.out.println("�����Դϴ�.")
            }
        }
    }
}