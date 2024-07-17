package lang.string;

public class StringMethodTest {
    public static void main(String[] args) {
        String s1 = "메코클 개존잼이네ㅋㅋㅋ";
        String s2 = "메코클 개존잼이네ㅋㅋㅋ";
        String s3 = "메코클 개졸잼이네ㅋㅋㅋ";
        String s4 = "Meta Comedy";
        String s5 = "Meta comedy";
        String s6 = "Meta Comedi";

        System.out.println("charAt(); 지정 인덱스 문자열 반환(0번부터 시작)");
        System.out.println(s1.charAt(2));
        System.out.println();

        System.out.println("eqealsIgnoreCase(); 대소문자 구분없이 비교");
        System.out.println(s4.equals(s5)); //대소문자 구분
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println();

        System.out.println("compareTo(); 사전순으로 비교");
        System.out.println(s4.compareTo(s6));
        System.out.println(s4.compareToIgnoreCase(s6));
        //얘네 뭐임?
        System.out.println();

        System.out.println("indexOf(); 문자열 등장위치 반환");
        System.out.println(s4.indexOf("e"));
        System.out.println(s4.indexOf("e", 3));
        System.out.println();

        System.out.println("replace(); 특정 문자열을 새 문자열로 대체");
        String s0 = s1.replace("메코", "바보");
        System.out.println(s0);
        System.out.println(s1);
        System.out.println("replace로 바꾼 놈은 그때만 바뀌고 다시 돌아오는 듯");
        System.out.println("당연! String는 불변객체라서 내가 요청한 조건에 맞는 새로운 new String를 만들어서 주는것일 뿐이니까");
    }
}
