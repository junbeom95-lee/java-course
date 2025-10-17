package chapter3.stream.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(List.of("Steve", "Kim", "Park", "Kang", "Seo"));

        //1. 익명 클래스 활용
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + "님";
            }
        };
        
        List<String> list1 = students.stream()  //1. 데이터 스트림 준비
                .filter(s -> s.contains("e"))
                .map(function)                  //2. 중간 연산 등록
                .collect(Collectors.toList());  //3. 최종 연산 하기
        System.out.println("list1 = " + list1);

        //2. 람다식 만들기
        Function<String, String> functionLambda = (s -> s + "짱짱님");
        List<String> list2 = students.stream()  //1. 데이터 스트림 준비
                .filter(name -> name.startsWith("K"))
                .map(functionLambda)            //2. 중간 연산 등록
                .collect(Collectors.toList());  //3. 최종 연산 하기
        System.out.println("list2 = " + list2);


        //3. 직접 람다식 대입
        List<String> list3 = students.stream()  //1. 데이터 준비
                .filter(name -> name.length() > 3)
                .map(s -> s + "수강생님")    //2. 중간 연산
                .collect(Collectors.toList());  //3. 최종 연산
        System.out.println("list3 = " + list3);
    }
}
