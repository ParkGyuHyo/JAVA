import java.util.Scanner;

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int Square() {
        return width * height;
    }

    int showX() {
        return this.x;
    }

    int showY() {
        return this.y;
    }
}

public class PKH_0608_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("X��ǥ�� �Է��ϼ���: ");
        int x = in.nextInt();
        System.out.print("Y��ǥ�� �Է��ϼ���: ");
        int y = in.nextInt();
        System.out.print("���α��̸� �Է��ϼ���: ");
        int width = in.nextInt();
        System.out.print("���̸� �Է��ϼ���: ");
        int height = in.nextInt();

        Rectangle Rec = new Rectangle(x, y, width, height);

        System.out.printf("����: %d\n", Rec.Square());
        System.out.printf("X��ǥ: %d\n", Rec.showX());
        System.out.printf("Y��ǥ: %d\n", Rec.showY());
    }
}