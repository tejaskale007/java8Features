package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static List<Student> sortStudentByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGPA() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGPAandReverse() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort by Name: " + sortStudentByName());
        System.out.println("\n\nSort by GPA: " + sortStudentByGPA());
        System.out.println("\n\nSort by GPA and Reverse it: " + sortStudentByGPAandReverse());
    }
}
