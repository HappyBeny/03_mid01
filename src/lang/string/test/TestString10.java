package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruit = fruits.split(",");
        for (String a : fruit){
            System.out.println(a);
        }

        String joinedString = String.join(" -> ", fruit);
        System.out.println("joinedString = " + joinedString);
    }
}
