import java.util.Scanner;

public class PKH_0525_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt, price;
        double total;

        System.out.print("상품의 수량을 입력하세요: ");
        cnt = sc.nextInt();

        System.out.print("상품의 단가를 입력하세요: ");
        price = sc.nextInt();

        total = cnt * price;

        if (cnt >= 20) {
            total *= 0.8;
        } else {
            if (cnt >= 10) {
                total *= 0.9;
            }
        }

        System.out.printf("금액 : %d원", (int)total);
    }
}