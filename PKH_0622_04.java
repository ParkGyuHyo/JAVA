class Car {
    private String name;
    private int cc;

    public void setName(String name) {
        this.name = name;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void Crackion() {
        System.out.printf("ÀÌ¸§: %s, ¹è±â·®: %d\n", this.name, this.cc);
    }
}

class Truct extends Car {
    private int kg;

    public void setKg(int kg) {
        this.kg = kg;
    }

   // public void Crackion() {
   //     System.out.println("======== Æ®·° ========");
   //     super.Crackion();
   //     System.out.printf("»§»§\n");
   // }

    public void Jim() {
        System.out.printf("Áü½Æ±â ¹«°Ô: %s\n", this.kg);
    }
}

class Sport extends Car {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

   // public void Crackion() {
   //     System.out.println("======== ½ºÆ÷Ã÷Ä« ========");
   //     super.Crackion();
   //     System.out.printf("ºÎ¿ì¿õ\n");
   // }

    public void Drive() {
        System.out.printf("µå¶óÀÌºê ¼Óµµ: %d\n", this.speed);
    }
}

public class PKH_0622_04 {
    public static void main(String[] args) {
        Truct tc = new Truct();
        Sport sp = new Sport();

        tc.setName("Æ®·°");
        tc.setCc(1600);
        tc.setKg(100);

        sp.setName("½ºÆ÷Ã÷Ä«");
        sp.setCc(3000);
        sp.setSpeed(200);

        tc.Crackion();
        tc.Jim();

        sp.Crackion();
        sp.Drive();
    }
}