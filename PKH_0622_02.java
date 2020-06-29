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

    public void studentPrint() {
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

    public void professorPrint() {
        System.out.println("===== 교수 =====");
        peoplePrint();
        System.out.println("사무실 : " + this.office);
    }
}

public class PKH_0622_02 {
    public static void main(String[] args) {
        Student std = new Student();
        Professor prof = new Professor();

        std.setName("Kim");
        std.setId(12345);

        prof.setName("Park");
        prof.setOffice(365);

        std.studentPrint();
        prof.professorPrint();
    }
}