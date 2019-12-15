package com.zfs.pojo;

import java.util.List;
import java.util.Scanner;

public class Examination {

    private List<Student> students;
    private List<Question> questions;

    public Examination() {
    }

    public Examination(List<Student> students, List<Question> questions) {
        this.students = students;
        this.questions = questions;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "students=" + students +
                ", questions=" + questions +
                '}';
    }

    public Student login() {
        Scanner s = new Scanner(System.in);
        System.out.printf("请输入用户名:");
        String name = s.next();
        for (Student student : students) {
            if (name.equals(student.getName())) {
                System.out.printf("请输入密码 :");
                for (int i = 0; i < 4; i++) {
                    if (s.next().equals(student.getPassword())) {
                        return student;
                    } else {
                        System.out.println("密码错误！还有" + (3 - i) + "次机会");
                    }
                }
                System.exit(0);
            } else {
                System.out.println("用户名不存在！");
            }
        }
        return null;
    }

    public void Test(){
        Scanner s = new Scanner(System.in);
        Student student = login();
        if(student != null){
            for(Question question : questions){
                System.out.print(question.getqNo()+ "."+question.getqName() + ":");
                Character option = s.next().toCharArray()[0];
                question.setOption(option);
                if(option.equals(question.getAnswer())){
                    student.setScore(student.getScore()+10.0);
                }
            }
        }
    }


}
