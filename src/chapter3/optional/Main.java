package chapter3.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Camp camp = new Camp();
        Student steve = new Student("Steve");
        camp.setStudent(steve);

        //Optional 객체 홯용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();

        if(flag) {
            //있으면
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("StudentName: " + studentName);
        } else {
            //null 일 경우
            System.out.println("학생이 없습니다.");
        }

        //1. student = null
//        Student student = camp.getStudent();
//        System.out.println("student = " + student); // null 값이 없음

        //2. NullPointerException
//        String studentName = student.getName();
//        System.out.println("studentName = " + studentName);





    }
}

//직접적인 null 처리 방법
//String studentName;
//        if (student != null) {
//studentName = student.getName();
//        } else {
//studentName = "등록된 학생이 아닙니다.";
//        }
//        System.out.println("studentName = " + studentName);