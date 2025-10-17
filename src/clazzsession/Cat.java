package clazzsession;

public class Cat {

    //속
    private String name;
    private int age;
    private boolean isNeutering;
    //생
    //생성자 3가지 특징
    /*
     * 클래스와 이름이 같다
     * 여러개 존재할 수 있다
     * 반환 데이터 타입이 없다.
     */
    //생성자를 하나라도 만들면 기본생성자는 사라짐
    //Cat() {} //기본 생성자
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Cat(String name, int age, boolean isNeutering) {
        this.name = name;
        this.age = age;
        this.isNeutering = isNeutering;
    }

    //기 (getter / setter)
    //getter - 속성을 가져오는 기능
    public String getName() {
        return this.name;
    }

    public boolean getIsNeutering() {
        return this.isNeutering;
    }

    //setter - 속성을 설정하는 기능
    public void setIsNeutering(boolean neutering) {
        this.isNeutering = neutering;
    }

    //
}
