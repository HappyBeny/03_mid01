package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        //b.setValue("부산"); //b의 값을 부산으로 변경해야 함.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
