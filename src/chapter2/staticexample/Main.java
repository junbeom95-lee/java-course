package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {
        //static 변수, 메서드 활용
        //Person은 프로그램 시작 시점에 Method Area에 올라와 있음
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();

        //인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        //인스턴스 변수 활용
        p1.name = "jblee";
        p2.name = "Steve";

        //인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        Person.printPopulation();
    }
}
