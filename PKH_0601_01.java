import java.util.Scanner;

public class PKH_0601_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        double hei, wei, biman, pyojun

        System.out.print("키를 입력해주세요: ")
        hei = sc.nextDouble();

        System.out.print("몸무게를 입력해주세요: ")
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

        System.out.printf("표준 몸무게 : %.2f\n비만도 : %.2f\n", pyojun, biman)
        System.out.println("================================")

        if (biman > 20) {
            System.out.println("비만입니다.")
        } else {
            if (biman >= 10) {
                System.out.println("과체중입니다.")
            } else {
                System.out.println("정상입니다.")
            }
        }
    }
}