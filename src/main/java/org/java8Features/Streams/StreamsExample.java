package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() > 3;
    static Predicate<Student> gpaPredicate = student -> student.getGpa() > 3;

    public static void main(String[] args) {
        //student name and their activities in a map
        Map<String, List<String>> nameMap =
                StudentDataBase.getAllStudents().stream()
                        .filter(gradeLevelPredicate.and(gpaPredicate))
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));//collect is principal operation
                                                                                                // which enables the other methods to execute.
        System.out.println("StudentMap: " + nameMap);
    }
}
