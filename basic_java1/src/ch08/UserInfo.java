package ch08;

// 사용자의 정보를 저장해 두어야 한다. (나중에 사용하기 위해서)
public class UserInfo {

    int userId;
    String password;
    String name;
    String tel;

    // 생성자가 여러개라면 -> 생성자 오버로딩이라고 한다.

    // 기본 생성자 모양
    public UserInfo() {

    }

    // 사용자 정의 생성자
    public UserInfo(int uid) {
        System.out.println("1. 사용자정의 생성자 호출 됨");
        // 멤버 변수에 값을 초기화 시키는 코드를 작성한다.
        userId = uid;
    }
    // 사용자 정의 생성자
    public UserInfo(int uid, String p) {
        userId = uid;
        password = p;
    }

    public UserInfo(int uid, String p, String n) {
        userId = uid;
        password = p;
        name = n;
    }

    public UserInfo(int uid, String p, String n, String t) {
        userId = uid;
        password = p;
        name = n;
        tel = t;
    }

}
