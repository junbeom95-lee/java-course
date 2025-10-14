package chapter1.method;

public class Main {
    public static void main(String[] args) {
        //1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();
        //[계산기] calculator = [계산기]

        //2. 메서드(함수)를 호출
        int result = calculator.sum(1, 2);
    }
}
