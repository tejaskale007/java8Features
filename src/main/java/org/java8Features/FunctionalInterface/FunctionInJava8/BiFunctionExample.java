package org.java8Features.FunctionalInterface.FunctionInJava8;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> predicate = (student -> student.getGradeLevel()>3.4);
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students, studentPredicate) -> {
       Map<String,Double> studentGradeMap = new HashMap<>();
       students.forEach(student -> {
           if(studentPredicate.test(student)){
               studentGradeMap.put(student.getName(),student.getGpa());
           }
       });
       return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),predicate));
    }
}
