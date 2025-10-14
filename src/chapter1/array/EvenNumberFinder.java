package chapter1.array;

public class EvenNumberFinder { //1-9 실습1 짝수만 출력하기
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 15, 20};

        for(int num : numbers) {
            System.out.println("짝수: ");
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
