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

        System.out.print("X좌표를 입력하세요: ");
        int x = in.nextInt();
        System.out.print("Y좌표를 입력하세요: ");
        int y = in.nextInt();
        System.out.print("가로길이를 입력하세요: ");
        int width = in.nextInt();
        System.out.print("높이를 입력하세요: ");
        int height = in.nextInt();

        Rectangle Rec = new Rectangle(x, y, width, height);

        System.out.printf("넓이: %d\n", Rec.Square());
        System.out.printf("X좌표: %d\n", Rec.showX());
        System.out.printf("Y좌표: %d\n", Rec.showY());
    }
}