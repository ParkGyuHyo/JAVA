class Car {
    private String color;
    private int speed;

    Car() {
        this.color = "red";
        this.speed = 0;
    }

    Car(String color) {
        this.color = color;
        this.speed = 0;
    }

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void upSpeed(int incSpeed) {
        this.speed += incSpeed;
    }

    void downSpeed(int decSpeed) {
        this.speed -= decSpeed;
    }

    String getColor() {
        return this.color;
    }

    int getSpeed() {
        return this.speed;
    }

    void display() {
        System.out.printf("현재 차량 컬러 : %s이며, 현재 차량 속도 : %dkm\n", this.color, this.speed);
    }
}

public class PKH_0615_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.upSpeed(100);
        car1.downSpeed(70);
        car1.display();

        Car car2 = new Car("blue");
        car2.upSpeed(150);
        car2.downSpeed(90);
        car2.display();

        Car car3 = new Car("yellow", 200);
        car3.upSpeed(0);
        car3.downSpeed(200);
        car3.display();
    }
}