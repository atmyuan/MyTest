package main.com.atmyuan.javabase.dto;

public class Student {
    private String name;
    private int age;
    private String colour;

    //无参构造方法
    public Student() {

    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
