import java.io.IOException;

class BadClass {
    public void badCode(boolean bool) throws Exception, IOException {
        //int x;

        // by zero �߻� -> main Ŭ������ ������ ����.
        //x = 3 / 0;

        // �׽�Ʈ�� ���� ������ ����
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
            System.out.println("���α׷� ���� ����");
        } catch (IOException e) {
            System.out.println("IOException ���� �߻�");
        } catch (Exception e) {
            System.out.println("���� �߻�");
        } finally {
            System.out.println("������ �߻��ص� ������ �����ؾ� �Ǵ� �κ�");
        }
    }
}