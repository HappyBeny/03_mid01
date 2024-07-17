package enumeration.ex1;

public class StringGradeEx1_2 {
    //StringGrade에 있는 상수를 사용해달라고 명시하지 않으면 아래와 같은 실수가 그대로 발생함.
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMOND등급의 할인 금액 : " + diamondd);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
    }
}
