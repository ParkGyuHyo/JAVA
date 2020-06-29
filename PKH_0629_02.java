class AllPrint {
    private String model;
    private String mnufacturer;
    private int printedCount;
    private int availableCount;

    AllPrint(String model, String mnufacturer, int availableCount) {
        this.model = model;
        this.mnufacturer = mnufacturer;
        this.printedCount = 0;
        this.availableCount = availableCount;
    }

    void print(int pages) {
        printedCount += pages;
        availableCount -= pages;

        System.out.println("�𵨸� : " + model);
        System.out.println("������ : " + mnufacturer);
        System.out.println("�μ��� : " + pages);
        System.out.println("�μ����� �ܷ� : " + availableCount);
        System.out.println("�� �μ� �ż� : " + printedCount);
    }
}

class InkjesPrint extends AllPrint {
    int availableInk;

    InkjesPrint(String model, String mnufacturer, int availableCount, int availableInk) {
        super(model, mnufacturer, availableCount);
        this.availableInk = availableInk;
    }

    void printInkjes(int pages) {
        availableInk -= pages;
        System.out.println("��ũ �ܷ� : " + availableInk);
    }
}

class LaserPrint extends AllPrint {
    int availableLaser;

    LaserPrint(String model, String mnufacturer, int availableCount, int availableLaser) {
        super(model, mnufacturer, availableCount);
        this.availableLaser = availableLaser;
    }

    void printLaser(int pages) {
        availableToner -= pages;
        System.out.println("��ũ �ܷ� : " + availableLaser);
    }
}

public class PKH_0629_02 {
    public static void main(String args[]) {
        InkjesPrint print1 = new InkjesPrint("��ũ��", "LG", 1000, 900);
        LaserPrint print2 = new LaserPrint("������", "SAMSUNG", 1000, 700);

        print1.print(100);
        print1.printInkjes(10);
        System.out.println("=================================");
        print2.print(50);
        print2.printLaser(5);
        System.out.println("=================================");
        print2.print(100);
        print2.printLaser(10);
    }
}