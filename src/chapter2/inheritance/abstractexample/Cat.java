package chapter2.inheritance.abstractexample;

public class Cat extends Animal {

    @Override
    void eat() {    //자식에서 강제 구현된 메서드
        System.out.println("냠냠...");
    }
}
