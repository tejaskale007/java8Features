package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountDistinctSortExample {

        public static long getStudentActivitiesCount(){
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct().count();
        return noOfStudentActivities;
    }

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()// Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//converts list of streams into a single stream || converts list of list into single list
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println( printStudentActivities());
        System.out.println( "Get distinct Student Activity Count: " + getStudentActivitiesCount());
    }
}
