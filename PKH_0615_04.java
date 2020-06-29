class Book {
    private String booknm;
    private String person;
    private String bdate;
    private String isbn;

    Book() {
        this.booknm = "����";
        this.person = "����";
        this.bdate = "����";
        this.isbn = "����";
    }

    Book(String booknm) {
        this.booknm = booknm;
        this.person = "����";
        this.bdate = "����";
        this.isbn = "����";
    }

    Book(String booknm, String person) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = "����";
        this.isbn = "����";
    }

    Book(String booknm, String person, String bdate) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = bdate;
        this.isbn = "����";
    }

    Book(String booknm, String person, String bdate, String isbn) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = bdate;
        this.isbn = isbn;
    }

    void display() {
        System.out.printf("å���� : %s\n", this.booknm);
        System.out.printf("���� : %s\n", this.person);
        System.out.printf("��¥ : %s\n", this.bdate);
        System.out.printf("isbn : %s\n", this.isbn);
        System.out.println("===============================");
    }
}

public class PKH_0615_04 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("java ����");
        Book book3 = new Book("c ����", "���¿�");
        Book book4 = new Book("c++", "���μ�", "1991.01.01", "978-12-7050-1");

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}