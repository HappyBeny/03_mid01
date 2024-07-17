package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;
    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter {
            int value = 0;
            public void printData() {
                System.out.println("value = " + value); //자기 인스턴스
                System.out.println("localVar = " + localVar); //자기 범위의 지역변수
                System.out.println("paramVar = " + paramVar); //
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
