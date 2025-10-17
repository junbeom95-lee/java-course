package chapter3.optional.ex;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CampService cs = new CampService();

        System.out.print("수강생의 이름을 입력해주세요: ");
        String studentName = sc.next();

        Optional<Student> student = cs.getStudent(studentName);

        if(student.isPresent()) {
            Student s = student.get();
            System.out.println(s.getName() + " 학생이 존재합니다.");
        } else {
            System.out.println(studentName + " 학생은 없습니다.");
        }
    }
}
