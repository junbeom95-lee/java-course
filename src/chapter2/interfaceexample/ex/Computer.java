package chapter2.interfaceexample.ex;

public class Computer implements Gajeonjepum {
    @Override
    public void turnOn() {
        System.out.println("콤퓨타 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터 끄기");
    }

    public void code() {
        System.out.println("코딩해요");
    }
}
