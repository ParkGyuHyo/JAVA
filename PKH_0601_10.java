class Student {
    String name;
    int id;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }
}

public class PKH_0601_10 {
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("�ڱ�ȿ");
        std.setId(201987062);

        System.out.printf("�̸�: %s\n�й�: %d", std.getName(), std.getId());
    }
}