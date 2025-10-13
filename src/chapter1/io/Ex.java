package chapter1.io;

import java.util.Scanner;

public class Ex {   //1-5 실습해보기
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TODO: 사용자로부터 이름을 입력받기
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.nextLine();

        // TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이를 입력해주세요: ");
        int age = scanner.nextInt();

        // TODO: 입력받은 값 출력
        System.out.print("출력 결과:\n이름: " + name +"\n나이: " + age);
    }
}
