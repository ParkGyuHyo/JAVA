class People {
    private String name;

    People() {}

    void setName(String name) {
        this.name = name;
    }

    void peoplePrint() {
        System.out.println("이름 : " + this.name);
    }
}

class Student extends People{
    private int id;

    Student() {}

    void setId(int id) {
        this.id = id;
    }

    void studentPrint() {
        System.out.println("---학생---");
        peoplePrint();
        System.out.println("학번 : " + this.id);
    }
}

public class PKH_0615_05 {
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("홍길동");
        std.setId(12345);

        std.studentPrint();
    }
}