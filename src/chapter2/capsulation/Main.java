package chapter2.capsulation;

public class Main { //2-7강
    public static void main(String[] args) {

        //생성자 호출
//        Person person = new Person();
        Person person = new Person("jbLee");
        //인스턴스 변수 접근
//        person.name = "jblee";
//        person.secret = "??"; //private 으로 접근 안됨

        //인스턴스 메서드 접근
        person.methodA();
//        person.methodB(); //private 접근 안됨

        //게터
        String name = person.getName();
        System.out.println("이름: " + name);

        //세터
        person.setName("kyKim");
        String name2 = person.getName();
        System.out.println("이름: " + name2);

    }
}
