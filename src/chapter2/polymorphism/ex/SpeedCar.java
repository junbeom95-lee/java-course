package chapter2.polymorphism.ex;

public class SpeedCar implements Car {
    @Override
    public void drive() {
        System.out.println("달릴꺼야");
    }

    @Override
    public void run() {
        System.out.println("시동걸어볼까! 달려보자");

    }

    public void stop() {
        System.out.println("멈춰!");
    }
}
