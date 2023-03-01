package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

public class MapReduceExample {

    static long noOfNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getActivities().size()>2)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoOfNotebooks)
                .reduce(0l,(a,b)->a+b); //.reduce(0,(a,b)->a+b);
    }

    public static void main(String[] args) {
        System.out.println("No. of Notebooks: " + noOfNoteBooks());
    }
}
