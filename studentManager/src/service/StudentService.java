package service;

import dao.StudentDao;
import domain.Student;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
