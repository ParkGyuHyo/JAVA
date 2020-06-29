import java.util.Scanner;

class Account {
    int balance;

    Account() { this.balance = 0; }

    void deposit(int amt) {
        this.balance += amt;
    }

    withdraw(int amt) {
        this.balance -= amt;
    }
}

public class PKH_0608_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account a1 = new Account();

        System.out.print("�Աݾ��� �Է��ϼ��� : ");
        int amt1 = input.nextInt();
        a1.deposit(amt1);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.balance);

        System.out.print("��ݾ��� �Է��ϼ��� : ");
        int amt2 = input.nextInt();
        a1.withdraw(amt2);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.balance);

        System.out.print("�Աݾ��� �Է��ϼ��� : ");
        int amt3 = input.nextInt();
        a1.deposit(amt3);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.balance);
    }
}