package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하게요 [GUEST, LOGIN, ADIMN] : ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        if (0 < authGrade.getLevel()){
            System.out.println(" - 메인 화면");
        }
        if (1 < authGrade.getLevel()){
            System.out.println(" - 이메일 관리 화면");
        }
        if (2 < authGrade.getLevel()){
            System.out.println(" - 관리자 화면");
        }
    }
}
