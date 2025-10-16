package chapter2.abstraction.v1;

public interface Animal extends LifeForm {
    @Override
    void exist();

    void makeSound();
}
