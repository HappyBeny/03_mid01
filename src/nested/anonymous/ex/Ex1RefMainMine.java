package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainMine {
        public static void hello (int option) {
            System.out.println("프로그램 시작");

            //코드 조각 시작
            if (option == 1) {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            } else if (option == 2) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
            //코드 조각 종료
            System.out.println("프로그램 종료");
        }

    public static void main(String[] args) {
        hello(1);
        hello(2);
    }
}
