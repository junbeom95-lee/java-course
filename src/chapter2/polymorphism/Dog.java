package chapter2.polymorphism;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    @Override
    public void exist() {
        System.out.println("강아지가 존재합니다.");
    }

    public void wag() {
        System.out.println("흔들 흔들~");
    }
}
