package chapter1.condition;

import java.util.Scanner;

public class TrafficLight { //1-7 조건문 실습 1
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("신호등 색상을 입력하세요 ");
            String color = scanner.nextLine();

            if (color.equals("초록불")) {
                System.out.println("건너세요!");
            } else if (color.equals("노란불")) {
                System.out.println("주의하세요!");
            } else if (color.equals("빨간불")) {
                System.out.println("멈추세요!");
            } else {
                System.out.println("잘못된 입력입니다!");
                break;
            }
        }
    }
}
