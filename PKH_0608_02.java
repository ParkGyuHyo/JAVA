class Developer {
    private String name;
    private int career;

    Developer(String name, int career) {
        this.name = name;
        this.career = career;
    }

    int Salary() {
        if (this.career >= 7) {
            return 4500 + (100 * this.career);
        } else {
            if (this.career >= 3) {
                return 3500 + (100 * this.career);
            } else {
                return 2800 + (100 * this.career);
            }
        }
    }

    String getName() {
        return this.name;
    }
}

public class PKH_0608_02 {
    public static void main(String[] args) {
        Developer John = new Developer("John", 2);
        Developer Park = new Developer("Park", 5);
        Developer Hong = new Developer("Hong", 9);

        System.out.printf("%s¿« ø¨∫¿ : %d\n", John.getName(), John.Salary());
        System.out.printf("%s¿« ø¨∫¿ : %d\n", Park.getName(), Park.Salary());
        System.out.printf("%s¿« ø¨∫¿ : %d\n", Hong.getName(), Hong.Salary());
    }
}