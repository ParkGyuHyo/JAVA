import java.util.Scanner;

public class PKH_0525_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int normal_price, price;
        double profit;

        System.out.print("원가를 입력하세요: ");
        normal_price = sc.nextInt();

        System.out.print("판매가를 입력하세요: ");
        price = sc.nextInt();

        profit = (price - normal_price) / normal_price * 100;

        System.out.printf("수익률 : %d%%\n", (int)profit);

        if (profit >= 30) {
            System.out.println("최상의 수익입니다.");
        } else {
            if (profit >= 20) {
                System.out.println("좋은 수익입니다.");
            } else {
                if (profit >= 10) {
                    System.out.println("보통 수익입니다.");
                } else {
                    System.out.println("수익이 없습니다..");
                }
            }
        }
    }
}