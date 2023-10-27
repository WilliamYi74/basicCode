package dao;

import domain.Student;

public class StudentDao {
    private Student[] students = new Student[5];
    private int studentCount = 0;

    public boolean addStudent(Student student) {
        if (this.studentCount >= 5) {
            System.out.println("学生数量已满");
            return false;
        }
        this.students[this.studentCount++] = student;
        return true;
    }
}
