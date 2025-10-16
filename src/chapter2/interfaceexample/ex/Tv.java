package chapter2.interfaceexample.ex;

public class Tv implements Gajeonjepum {

    @Override
    public void turnOn() {
        System.out.println("짜잔 티비 온!");
    }

    @Override
    public void turnOff() {
        System.out.println("바보상자 안녕");
    }

    public void chUp() {
        System.out.println("채널 올려!");
    }
}
