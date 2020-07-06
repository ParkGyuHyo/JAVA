interface pet {
    public abstract void play();
}

interface HouseAnimal {
    public abstract void space();
}

abstract class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();
}

class Dog extends Animal implements pet, HouseAnimal {
    public void play() {
        System.out.println("�� �������");
    }

    public void space() {
        System.out.println("�Ž�");
    }

    public void sound() {
        System.out.println("�۸�");
    }
}

class Cat extends Animal implements pet, HouseAnimal {
    public void play() {
        System.out.println("ĹŸ��");
    }

    public void space() {
        System.out.println("�ȹ�");
    }

    public void sound() {
        System.out.println("�߿�");
    }
}

public class PKH_0706_02 {
    public static void main(String args[]) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.sound();
        cat.play();
        cat.space();

        dog.sound();
        dog.play();
        dog.space();
    }
}