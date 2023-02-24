package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    BiConsumer<String, List<String>> studentBiConsumer = (name,activities)->{
        System.out.println("Name: "+name + ":: Activities: "+activities);
    };

    Predicate<Student> studentPredicate  = (student)->student.getGpa()>3.0;
    Consumer<Student> studentConsumer = (student -> {
        studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach((student -> {
            if(studentPredicate.test(student)){
                studentConsumer.accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
