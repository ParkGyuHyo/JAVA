class Student {
    private String name;
    private int id;

    Student() {
        System.out.println("Student() ������ ȣ��");

        this.name = "ȫ�浿";
        this.id = 123;
    }

    Student(String name) {
        System.out.println("Student(String name) ������ ȣ��");

        this.name = name;
        this.id = 12345;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }
}

public class PKH_0608_01 {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("ȫ�浿2");

        System.out.printf("std1 �й� : %d �̸� : %s\n", std1.getId(), std1.getName());
        System.out.printf("std2 �й� : %d �̸� : %s\n", std2.getId(), std2.getName());
    }
}