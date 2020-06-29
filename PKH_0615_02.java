class HelloWorld {
    String msg;

    HelloWorld() {
        this.msg = "Hello World!!";
    }

    HelloWorld(String msg) {
        this.msg = msg;
    }

    void print() {
        System.out.println(msg);
    }
}

public class PKH_0615_02 {
    public static void main(String[] args) {
        HelloWorld hello1 = new HelloWorld();
        hello1.print();

        HelloWorld hello2 = new HelloWorld("My Hello World!!");
        hello2.print();
    }
}