package com.zfs.jewelrySale;

public class JewelerImpl implements IEmployee {

    private String name;
    private int number;

    public JewelerImpl() {
    }

    public JewelerImpl(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Jeweler{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", finalSalary=" +getSalary() +'}';
    }


    @Override
    public double getSalary() {
        return number*50;
    }
}
