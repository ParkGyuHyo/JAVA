abstract class Shape {
    private int size;

    public abstract void getArea();
}

class Triangle extends Shape{
    private int x;
    private int y;

    Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getArea() {
        System.out.println(x*y/2.0);
    }
}

class Rectangle extends Shape{
    private int x;
    private int y;

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getArea() {
        System.out.println(x*y);
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println(radius*radius*3.14);
    }
}
public class PKH_0706_03 {
    public static void main(String[] args) {
        Shape sha[] = new Shape[3];
        sha[0] = new Triangle(3, 4);
        sha[1] = new Rectangle(4, 4);
        sha[2] = new Circle(5);

        for (int i = 0; i < 3; i++) {
            sha[i].getArea();
        }
    }
}

