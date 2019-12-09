package com.zfs.jewelrySale;

public class EmployeeImpl implements IEmployee{

    private String name;
    private int workTime;
    private double basicSalary;

    public EmployeeImpl() {
    }

    public EmployeeImpl(String name, int workTime, double basicSalary) {
        this.name = name;
        this.workTime = workTime;
        this.basicSalary = basicSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "EmployeeImpl{" +
                "name='" + name + '\'' +
                ", workTime=" + workTime +
                ", basicSalary=" + basicSalary +
                ", finalSalary=" +getSalary() +'}';
    }

    @Override
    public double getSalary() {
        double overtimePay = 0;
        if(workTime > 196){
            overtimePay = (workTime - 196)*200;
        }

        return overtimePay+basicSalary;
    }
}
