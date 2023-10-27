package controller;

import domain.Student;
import service.StudentService;

import java.util.Scanner;

public class StudentInfoManager {
    private static StudentService studentService = new StudentService();

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=========欢迎来到学生管理系统===========");
            System.out.println("请输入操作序号:");
            System.out.println("1.查询学生\t2.新增学生\t3.修改学生\t4.删除学生\t5.退出系统");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queryStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("退出成功,欢迎下次使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }
    }

    private static void deleteStudent() {

    }

    private static void updateStudent() {

    }

    private static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生名称:");
        String studentName = sc.nextLine();
        System.out.println("请输入学生年龄:");
        int studentAge = sc.nextInt();
        Student student = new Student();
        student.setName(studentName);
        student.setAge(studentAge);
        boolean flag = studentService.addStudent(student);
        if (flag) {
            System.out.println("新增成功:" + student);
        } else {
            System.out.println("新增失败");
        }
    }

    private static void queryStudent() {

    }

}
