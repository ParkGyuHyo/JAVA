class Man {
    String name;
    Man(String name) {
        this.name = name;
    }
    Man() {
        this.name = "kim";
    }
    void tellYourName() {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man {
    String company;
    String position;

    BusinessMan(String name, String company, String position) {
        //super(name);
        this.company = company;
        this.position = position;
    }

    void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
    }
}

public class PKH_0629_01 {
    public static void main(String[] args) {
        BusinessMan m1 = new BusinessMan("Hong", "3D LED", "Staff");
        BusinessMan m2 = new BusinessMan("Le", "3D LED", "Assist");

        System.out.println("First Man info,,,");
        m1.tellYourName();
        m1.tellYourInfo();
        System.out.println("Second Man info,,,");
        m2.tellYourInfo();
    }
}