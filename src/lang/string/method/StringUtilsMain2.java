package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        //문자열 %d에 num값을, %b에 bool값을, %s에 str값을 대입
        String format1 = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        //printf >> 포멧과 프린트 한번에 처리
        // \n이 있어서 println처럼 줄바꿈처리
        System.out.printf("숫자 : %.3f\n", 10.1234);

        // matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? : " + str.matches(regex));
    }
}
