package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()// Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//converts list of streams into a single stream || converts list of list into single list
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println( printStudentActivities());
    }
}
