import java.util.Scanner;

public class PKH_0525_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kw;
        double normal_price;
        double kw1_price;

        System.out.print("기본 요금을 입력하세요: ");
        normal_price = sc.nextDouble();

        System.out.print("kw당 사용요금: ");
        kw1_price = sc.nextDouble();

        System.out.print("전기사용량을 입력하세요(kw): ");
        kw = sc.nextDouble();

        double total_price = normal_price + (kw * kw1_price);

        System.out.printf("전기요금은 %f 원 입니다.", total_price + (total_price * 0.09));
    }
}