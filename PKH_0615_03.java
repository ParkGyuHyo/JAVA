class ObjExam2 {
    private String name;
    private int num;

    ObjExam2() {
        this.name = "홍길동";
        this.num = 90;
    }

    ObjExam2(int num, String name) {
        this.name = name;
        this.num = num;
    }

    void prtVars() {
        System.out.printf("번호 : %d\n이름 : %s\n", this.num, this.name);
    }
}

public class PKH_0615_03 {
    public static void main(String[] args) {
        ObjExam2 obj1 = new ObjExam2();
        ObjExam2 obj2 = new ObjExam2(220, "아무개");

        obj1.prtVars();
        obj2.prtVars();
    }
}