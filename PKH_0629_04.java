import java.io.IOException;

class BadClass {
    public void badCode(boolean bool) throws Exception, IOException {
        //int x;

        // by zero 발생 -> main 클래스에 에러를 보냄.
        //x = 3 / 0;

        // 테스트를 위해 에러를 생성
        if (bool) {
            throw new Exception();
        } else {
            throw new IOException();
        }
    }
}

public class PKH_0629_04 {
    public static void main(String args[]) {
        BadClass bad = new BadClass();
        try {
            bad.badCode(false);
            System.out.println("프로그램 실행 오류");
        } catch (IOException e) {
            System.out.println("IOException 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생");
        } finally {
            System.out.println("오류가 발생해도 무조건 실행해야 되는 부분");
        }
    }
}