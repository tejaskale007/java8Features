package org.java8Features.methodReference;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> studentConsumer = (student -> {
        System.out.println(student.getGender());
    });

    static Consumer<Student> studentConsumer2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach((student) -> {
            studentConsumer.accept(student);
        });

        StudentDataBase.getAllStudents().forEach((student) -> {
            studentConsumer2.accept(student);
        });

    }
}
