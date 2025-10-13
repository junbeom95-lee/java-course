package chapter1.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //출력
        //println 사용
        System.out.println( "Hello");
        System.out.println( "Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.println("Hello\nWorld!");

        //입력(Scanner)
        Scanner scanner = new Scanner(System.in);

        //정수형 데이터를 정수형 박스 (a)에 넣은거임
        int a = 1;

        //문자열 입력 받기
        System.out.print("좋아 하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("intBox = " + longBox);

        //소수점
        System.out.print("소수점(double)를 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);
    }
}
