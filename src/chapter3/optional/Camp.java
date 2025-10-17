package chapter3.optional;

import java.util.Optional;

public class Camp {
    //속성
    private Student student;

    //생성자

    //기능
    public Optional<Student> getStudent() {
        return Optional.ofNullable(student);    //student 객체면 optional이 감싸서 주고 null이면 null을 감싸서 전달

//        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
