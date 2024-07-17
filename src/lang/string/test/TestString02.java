package lang.string.test;

public class TestString02 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;

        for (String a : arr){
            System.out.println(a + " : " + a.length());
            result += a.length();
        }
        System.out.println("sum = " + result);
    }
}
