class People {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void peoplePrint() {
        System.out.println("이름 : " + this.name);
    }
}

class Student extends People {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void peoplePrint1() {
        System.out.println("===== 학생 =====");
        peoplePrint();
        System.out.println("학번 : " + this.id);
    }
}

class Professor extends People {
    private int office;

    public void setOffice(int office) {
        this.office = office;
    }

    public void peoplePrint() {
        System.out.println("===== 교수 =====");
        super.peoplePrint();
        System.out.println("사무실 : " + this.office);
    }
}

public class PKH_0622_03 {
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("Kim");
        std.setId(12345);

        People p[] = new People[2];
        p[1] = new People();
        p[1].setName("Park");

        p[0] = std;
        p[0].peoplePrint1();

        p[1].peoplePrint();

        /*
        p[1] = prof;

        for (int i=0; i<People.length; i++) {
            p[i].peoplePrint();
            p[i].peoplePrint();
        }
        */
    }
}