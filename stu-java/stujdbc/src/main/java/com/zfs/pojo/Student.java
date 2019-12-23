package com.zfs.pojo;

public class Student {
    private Integer id;
    private String name;
    private String pwd;

    public Student() {
    }

    public Student( String name, String password) {
        this.name = name;
        this.pwd = password;
    }

    public Student(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.pwd = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return pwd;
    }

    public void setPassword(String password) {
        this.pwd = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + pwd + '\'' +
                '}';
    }
}

