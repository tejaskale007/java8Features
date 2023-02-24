package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static Predicate<Student> gradeGreaterThanEqualTo3Predicate = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> gpaGreaterThanEqualTo3Point9Predicate = (student -> student.getGpa()>=3.9);

    public static void filterStudentByGradeLevel(){
        BiConsumer<String, List<String>> printStudentNameAndActivity = (name, activities)-> System.out.println(name+ " : " + activities);
        studentList.forEach(student -> {
            if(gradeGreaterThanEqualTo3Predicate.test(student)){
                printStudentNameAndActivity.accept(student.getName(),student.getActivities());
            }
        });
    }

    public static void filterStudentByGPA(){
        studentList.forEach(student -> {
            if(gpaGreaterThanEqualTo3Point9Predicate.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        studentList.forEach(student -> {
            if(gpaGreaterThanEqualTo3Point9Predicate.and(gradeGreaterThanEqualTo3Predicate).test(student)){//and , or ,negate can for predicate
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        System.out.println();
        filterStudentByGPA();
        System.out.println();
        filterStudents();
    }
}
