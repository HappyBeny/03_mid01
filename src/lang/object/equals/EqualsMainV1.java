package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));
        //equals 오버라이딩 안 돼있음. 기본제공 equals는 == 비교 사용. 동등성이 아니라 동일성 비교함. >> false뜸
    }
}
