package chapter2.polymorphism.ex;

public class Main {
    public static void main(String[] args) {

        Car car1 = new SpeedCar();
        Car car2 = new LuxuryCar();

        car1.run();
        car1.drive();

        car2.run();
        car2.drive();

        SpeedCar sCar = (SpeedCar) car1;
        LuxuryCar lCar = (LuxuryCar) car2;
        sCar.stop();
        lCar.shiny();

        if(car1 instanceof LuxuryCar) {
            LuxuryCar lCar1 = (LuxuryCar) car1;
            lCar1.shiny();
        } else {
            System.out.println("럭셔리차가 아닌데");
        }

        Car[] cars = {new SpeedCar(), new LuxuryCar(), new LuxuryCar()};
        for(Car car : cars) {
            car.run();
        }
    }
}
