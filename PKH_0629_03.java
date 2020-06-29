public class PKH_0629_03 {
    public static void main(String args[]) {
            int x;
        try {
            x = 3 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("프로그램 끝");
    }
}