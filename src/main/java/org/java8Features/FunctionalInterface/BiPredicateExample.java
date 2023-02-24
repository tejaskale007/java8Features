package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel>=3 && gpa>3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name,activities)->{
        System.out.println("Name: "+name + ":: Activities: "+activities);
    };

    Consumer<Student> studentConsumer = (student -> {
        studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach((student -> {
            if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                studentConsumer.accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}

