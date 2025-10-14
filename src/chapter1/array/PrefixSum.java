package chapter1.array;

public class PrefixSum {    //1-9 실습 2 누적합 구하기
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8};
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        System.out.println("누적합: " + sum);
    }
}
