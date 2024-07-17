package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b; //원래 참조값 연산은 안 되는데, String만 특별히 허용
    }
}
