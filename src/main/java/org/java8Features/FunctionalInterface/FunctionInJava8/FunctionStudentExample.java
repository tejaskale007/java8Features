package org.java8Features.FunctionalInterface.FunctionInJava8;

import org.java8Features.FunctionalInterface.PredicateStudentExample;
import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionStudentExample {
    static Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>3);
    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
        Map<String,Double> studentGradMap = new HashMap<>();
        students.forEach(
                student -> {
                    if(PredicateStudentExample.gradeGreaterThanEqualTo3Predicate.test(student)){//static Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>3);
                        studentGradMap.put(student.getName(),student.getGpa());
                    }
                }
        );
        return studentGradMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
