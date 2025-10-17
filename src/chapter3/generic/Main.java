package chapter3.generic;

public class Main {
    public static void main(String[] args) {
        //1. 재사용 불가
        Box box1 = new Box(100);
//        new Box("ABC");   //새로운 클래스를 만들어서 담을 수 있게 해야함
//        new Box(0.1);

        //2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        //item을 활용하기 위해서는 down casting 필요
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem();   //형 변환 오류

        //제네릭 활용
        //1. 재사용성 보장 ( 타입소거 T -> Object)
        GenericBox<String> strGBox = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(100);
        GenericBox<Double> doubleGBox = new GenericBox<Double>(0.1);

        //2. 타입 안전성 보장  (타입소거: 자동으로 down casting 삽입)
        // 컴파일러가 대신 타입매개변수를 보면서 자동으로 다운캐스팅을 사용할 떄 해줌
        String strGBoxItem = strGBox.getItem(); //(String) 다운캐스팅 코드를 <T>가 넣어줌
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        //일반 메서드 (String 기준으로 타입 소거 발생해서 그 외 데이터 타입은 안됨)
        strGBox.printItem("ABC");
//        strGBox.printItem(100);//a
//        strGBox.printItem(0.1);

        //제네릭 메서드 (String과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(0.1);
    }
}
