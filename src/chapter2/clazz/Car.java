package chapter2.clazz;

public class Car {  //2-1 실습
    //속성
    String name;
    int speed;

    //생성자
    Car () {}
    Car (String name) {
        this.name = name;
    }

    //기능
    void drive() {  //주행 기능
        System.out.println("주행합니다");
    }

    void accelerate() { //가속 기능
        this.speed += 10;
        System.out.println("가속되었습니다 spped = " + this.speed);
    }
}
