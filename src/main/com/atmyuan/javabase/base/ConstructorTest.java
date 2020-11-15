package main.com.atmyuan.javabase.base;

import main.com.atmyuan.javabase.dto.Student;

public class ConstructorTest {
    public static void main(String[] args) {
        Student student = new Student("张三", 18);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
