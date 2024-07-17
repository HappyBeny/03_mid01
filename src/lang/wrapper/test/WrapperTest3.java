package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);
        System.out.println();

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);
        System.out.println();

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
