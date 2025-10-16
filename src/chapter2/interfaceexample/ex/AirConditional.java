package chapter2.interfaceexample.ex;

public class AirConditional implements Gajeonjepum {

    @Override
    public void turnOn() {
        System.out.println("세계 최고의 발명품! 가동!");
    }

    @Override
    public void turnOff() {
        System.out.println("환경파괴범 저리가!");
    }

    public void tempDown() {
        System.out.println("온도를 낮춰요");
    }
}
