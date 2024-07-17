package lang.string.test;

public class TestString01 {
    public static void main(String[] args) {
        String ur1 = "https://www.example.com";

        boolean result = ur1.startsWith("http://");
        System.out.println(result);

    }
}
