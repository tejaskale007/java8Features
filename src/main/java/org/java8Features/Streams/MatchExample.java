package org.java8Features.Streams;

import org.java8Features.data.StudentDataBase;

public class MatchExample {

    static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);//Returns whether all elements of this stream match the provided predicate.
    }

    static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3);//Returns whether all elements of this stream match the provided predicate
    }

    static boolean nonMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.2);//Returns whether no elements of this stream match the provided predicate
    }

    public static void main(String[] args) {
        System.out.println("All match: "+allMatch());
        System.out.println("Any match: "+anyMatch());
        System.out.println("None match: "+nonMatch());
    }
}
