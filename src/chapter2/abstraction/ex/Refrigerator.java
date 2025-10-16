package chapter2.abstraction.ex;

public class Refrigerator implements Gajeon {
    @Override
    public void makeSound() {
        System.out.println("띵");
    }

    @Override
    public void operating() {
        System.out.println("동작중");
    }

    public void frezz() {
        System.out.println("차가워져라");
    }
}
