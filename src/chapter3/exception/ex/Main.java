package chapter3.exception.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionEx authCheck = new ExceptionEx();

        boolean flag = false;

        do {
            //아이디, 비번 입력받음
            System.out.print("아이디를 입력해주세요: ");
            String id = sc.next();
            System.out.println("비밀번호를 입력해주세요: ");
            String pw = sc.next();

            //아이디, 비번 확인
            flag = authCheck.checkAuth(id, pw);
        } while(!flag);
    }
}
