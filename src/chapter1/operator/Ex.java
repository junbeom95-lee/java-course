package chapter1.operator;

import java.util.Scanner;

public class Ex {   //1-6 실습
    public static void main(String[] args) {
        int a = 15; // 값 할당 필요
        int b = 4; // 값 할당 필요


        // 1. 더하기
        int sum = a + b;
        // 1. 더하기 결과 출력
        System.out.println("덧셈 결과: " + sum);

        // 2. 빼기
        int sub = a - b;
        // 2. 빼기 결과 출력
        System.out.println("뺄셈 결과: " + sub);

        //3. 곱셈
        int mul = a * b;
        //3. 곱셈 결과 출력
        System.out.println("곱셈 결과: " + mul);

        //4. 나눗셈
        int div = a / b;
        //4. 나눗셈 결과 출력
        System.out.println("나눗셈 결과: " + div);

        //5. 나머지 결과
        int mod = a % b;
        //나머지 결과 출력
        System.out.println("나머지 결과: " + mod);


        int x = 10;
        int y = 5;

        System.out.println("x가 y보다 큰가? " + (x > y));
        System.out.println("x가 y보다 작은가? " + (x < y));
        System.out.println("x와 y가 같은가? " + (x == y));
        System.out.println("x와 y가 다른가? " +(x != y));


        Scanner scanner = new Scanner(System.in);
        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str = scanner.nextLine();
        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();
        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = str.equals(str2);
        // TODO: 결과 출력
        System.out.println("두 문자열이 같은가요? " + result);
    }
}