package chapter3.exception.ex;

import javax.naming.AuthenticationException;

public class ExceptionEx {

    private final String id = "admin";
    private final String pw = "1234";

    public boolean checkAuth(String id, String pw) {

        try {
            if (this.id.equals(id) && this.pw.equals(pw)) {
                System.out.println("로그인 성공");
                return true;
            } else {
                throw new AuthenticationException("로그인 실패");
            }
        } catch (AuthenticationException e) {
            System.out.println("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
            return false;
        }
    }
}
