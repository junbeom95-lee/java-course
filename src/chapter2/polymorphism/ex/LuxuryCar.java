package chapter2.polymorphism.ex;

public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("럭셔리 차 운행중~");
    }

    @Override
    public void run() {
        System.out.println("L차에 시동겁니다!");
    }

    public void shiny() {
        System.out.println("반짝이죠");
    }
}
