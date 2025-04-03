package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class School {

    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        System.out.println("Students of " + name + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudent(UUID studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }
}
