class People {
    private String name;

    People() {}

    void setName(String name) {
        this.name = name;
    }

    void peoplePrint() {
        System.out.println("�̸� : " + this.name);
    }
}

class Student extends People{
    private int id;

    Student() {}

    void setId(int id) {
        this.id = id;
    }

    void studentPrint() {
        System.out.println("---�л�---");
        peoplePrint();
        System.out.println("�й� : " + this.id);
    }
}

public class PKH_0615_05 {
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("ȫ�浿");
        std.setId(12345);

        std.studentPrint();
    }
}