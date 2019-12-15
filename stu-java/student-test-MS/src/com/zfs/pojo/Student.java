package com.zfs.pojo;

public class Student {

    private Integer number;
    private String name;
    private String password;
    private Double score = 0.0;


    public Student() {
    }

    public Student(Integer number, String name, String password) {
        this.number = number;
        this.name = name;
        this.password = password;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                '}';
    }


}
