package org.example;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("John", "Doe", UUID.fromString("bdd7a9f5-7ab2-4cb6-ab75-280cf56067f2")),
            new Student("Jane", "Doe"));
        for (Student student : students) {
            System.out.println(student);
        }

        School school = new School("Neue Fische");
        for (Student student : students) {
            school.addStudent(student);
        }

        school.printStudents();

        System.out.println(school.findStudent(UUID.fromString("bdd7a9f5-7ab2-4cb6-ab75-280cf56067f2")));

        school.removeStudent(school.findStudent(UUID.fromString("bdd7a9f5-7ab2-4cb6-ab75-280cf56067f2")));

        school.printStudents();
    }
}