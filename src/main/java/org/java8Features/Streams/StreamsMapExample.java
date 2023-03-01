package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;


public class StreamsMapExample {

    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
