class Book {
    private String booknm;
    private String person;
    private String bdate;
    private String isbn;

    Book() {
        this.booknm = "없음";
        this.person = "없음";
        this.bdate = "없음";
        this.isbn = "없음";
    }

    Book(String booknm) {
        this.booknm = booknm;
        this.person = "없음";
        this.bdate = "없음";
        this.isbn = "없음";
    }

    Book(String booknm, String person) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = "없음";
        this.isbn = "없음";
    }

    Book(String booknm, String person, String bdate) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = bdate;
        this.isbn = "없음";
    }

    Book(String booknm, String person, String bdate, String isbn) {
        this.booknm = booknm;
        this.person = person;
        this.bdate = bdate;
        this.isbn = isbn;
    }

    void display() {
        System.out.printf("책제목 : %s\n", this.booknm);
        System.out.printf("저자 : %s\n", this.person);
        System.out.printf("날짜 : %s\n", this.bdate);
        System.out.printf("isbn : %s\n", this.isbn);
        System.out.println("===============================");
    }
}

public class PKH_0615_04 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("java 정복");
        Book book3 = new Book("c 정복", "김태욱");
        Book book4 = new Book("c++", "차인숙", "1991.01.01", "978-12-7050-1");

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}