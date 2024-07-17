package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 | SendExceptionV3 e) {
            System.out.println("[연결 또는 전송 오류] 주소, 메시지 : " + e.getMessage());
            //e.getAddress나 e.getSendMessage 사용 불가능. 두 예외의 공통 부모의 메서드만 사용 가능
        } finally {
            client.disconnect();
        }
    }
}
