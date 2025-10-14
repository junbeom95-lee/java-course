package chapter1.loop;

import java.util.Scanner;

public class Gugudan {  //1-7 강의 실습 1 구구단

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요(2~9): ");
        int num = scanner.nextInt();

        System.out.println("==== " + num + "단 ====");

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
