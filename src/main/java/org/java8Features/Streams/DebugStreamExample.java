package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DebugStreamExample {
    static Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() > 3;
    static Predicate<Student> gpaPredicate = student -> student.getGpa() > 3;

    public static void main(String[] args) {
        //student name and their activities in a map
        Map<String, List<String>> nameMap =
                StudentDataBase.getAllStudents().stream()
                        .peek(student -> System.out.println("Student Name: " + student.getName()))
                        .filter(gradeLevelPredicate)
                        .peek(student -> System.out.println("After Predicate: " + student.getName()))
                        .filter(gpaPredicate)
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));
    }
}
