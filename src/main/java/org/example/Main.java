package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("John", "Doe"), new Student("Jane", "Doe"));
        for (Student student : students) {
            System.out.println(student);
        }

        School school = new School("Neue Fische");
        for (Student student : students) {
            school.addStudent(student);
        }

        school.printStudents();
    }
}