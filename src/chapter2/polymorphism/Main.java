package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        //다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();
//        animal1.scratch();   //X 사용불가

        animal2.exist();
        animal2.makeSound();

        //다운 캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();
        Dog dog = (Dog) animal2;
        dog.wag();

        //잘못된 다운 캐스팅 문제
//        Cat cat2 = (Cat) animal2;   //animal2 = Dog
//        cat2.scratch();

        //다운 캐스팅시 instanceOf 활용 방법
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        } else {
            System.out.println("고양이가 아닙니다.");
        }

        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        System.out.println(":::");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
