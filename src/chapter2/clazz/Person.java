package chapter2.clazz;

public class Person {

    //1. 속성 - 변수 선언으로 표현할 수 있음
    String name;
    int age;
    String address;

    //2. 생성자 - 조립설명서
    //기본생성자: Person() {}
    //생성자의 특징:
    //1. 클래스와 이름이 같음
    //2. 반환타입이 존재하지 않음
    //3. 여러개가 존재할 수 있음
    Person(String name, int age, String address) {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3. 기능
    int sum(int value1, int value2) {
        return value1 + value2;
    }

    //게터 getter - 클래스의 속성을 가져오는 기능
    String getName() {
        return this.name;
    }

    //세터 setter - 클래스의 속성을 설정하는 기능
    void setAddress(String address) {
        this.address = address;
    }
}
