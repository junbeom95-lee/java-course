package chapter3.optional.ex;

import java.util.Arrays;
import java.util.Optional;

public class CampService {

    //속성
    private static Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    private Student student;

    //기능
    public Optional<Student> getStudent(String name) {
        for(Student s : students) {
            if(s.getName().equals(name)) return Optional.ofNullable(s);
        }
//        Optional<Student> studentOptional = Arrays.stream(students)
//                .filter(student -> student.getName().equals(name))
//                .findFirst();
//        return studentOptional;
        return Optional.ofNullable(null);
    }

//    public Optional<Student> getStudent() {
//        return Optional.ofNullable(student);
//        return student;
//    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
