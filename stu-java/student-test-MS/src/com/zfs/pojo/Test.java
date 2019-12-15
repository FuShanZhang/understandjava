package com.zfs.pojo;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();
        Student student = new Student(1, "张三", "123");
        students.add(student);
        questions.add(new Question("算数1",'A'));
        questions.add(new Question("算数2",'A'));
        Examination examination = new Examination(students,questions);
        examination.Test();
        System.out.println(student);
    }
}
