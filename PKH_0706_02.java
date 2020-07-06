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
        System.out.println("°ø ¹°¾î¿À±â");
    }

    public void space() {
        System.out.println("°Å½Ç");
    }

    public void sound() {
        System.out.println("¸Û¸Û");
    }
}

class Cat extends Animal implements pet, HouseAnimal {
    public void play() {
        System.out.println("Ä¹Å¸¿ö");
    }

    public void space() {
        System.out.println("¾È¹æ");
    }

    public void sound() {
        System.out.println("¾ß¿Ë");
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