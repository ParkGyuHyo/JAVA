class Student {
    String name;
    int id;
}

public class PKH_0601_09 {
    public static void main(String[] args) {
        Student std = new Student();

        std.id = 12345;
        std.name = "Kim";

        System.out.printf("�̸� : %s �й� : %d", std.name, std.id);
    }
}