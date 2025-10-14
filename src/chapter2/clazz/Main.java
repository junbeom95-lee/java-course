package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        //객체 생성
        Person personA = new Person("jblee", 30);
        Person personB = new Person("Steve", 25);

        //속성에 직접 접근
//        System.out.println("설정 전 personA 이름: " + personA.name);
//        System.out.println("설정 전 personB 이름: " + personB.name);
//        personA.name = "jblee";
//        personB.name = "steve";
//        System.out.println("설정 후 personA 이름: " + personA.name);
//        System.out.println("설정 후 personB 이름: " + personB.name);

        //기능 활용
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //게터 활용
        String name = personA.getName();
        System.out.println("name = " + name);

        //세터 활용
        System.out.println("personA의 주소 : " + personA.address);
        personA.setAddress("수원");
        System.out.println("personA의 주소 : " + personA.address);


        //실습 - Car
        Car carA = new Car("붕붕");
        carA.drive();
        carA.accelerate();
    }
}
