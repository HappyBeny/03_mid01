package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        //String은 int나 boolean 같은 변수가 아닌 클래스임.
        // 클래스 지정으로도 문자열 생성 가능
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
