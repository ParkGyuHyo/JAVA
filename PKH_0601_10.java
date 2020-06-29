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

        std.setName("박규효");
        std.setId(201987062);

        System.out.printf("이름: %s\n학번: %d", std.getName(), std.getId());
    }
}