package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        // split()
        String[] spiltStr = str.split(", ");
        for (String s : spiltStr){
            System.out.println(s);
        }

        String joinStr = "";
        for (int i = 0; i < spiltStr.length; i++){
            String string = spiltStr[i];
            joinStr += string;
            if (i != spiltStr.length-1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);


        // join()
        String joinedStr =String.join(" - ", "A", "B", "C");
        System.out.println("연결된 문자열 : " + joinedStr);

        //문자열 배열 변경
        String result = String.join(" - ", spiltStr);
        System.out.println("result = " + result);
    }
}
