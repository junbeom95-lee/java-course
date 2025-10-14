package chapter1.loop;

public class GugudanAll {   //1-7 강의 실습 2 구구단
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.println("==== " + i + "단 ====");
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
