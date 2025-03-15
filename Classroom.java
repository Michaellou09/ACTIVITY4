/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author nicko
 */
import java.util.List;
import java.util.ArrayList;

class Classroom {

    private String className;
    private List<Student> students;

    public Classroom(String className) {
        this.className = className;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println("Student " + student.getId() + " transferred from " + className + " to " + newClassroom.className);
        }
    }

    public void displayStudents() {
        System.out.println("Students in " + className + ":");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}