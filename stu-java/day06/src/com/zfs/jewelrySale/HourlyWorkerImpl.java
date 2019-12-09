package com.zfs.jewelrySale;

public class HourlyWorkerImpl implements IEmployee {

    private String name;
    private int workTime;
    private double salaryHourly;

    public HourlyWorkerImpl() {
    }

    public HourlyWorkerImpl(String name, int workTime, double salaryHourly) {
        this.name = name;
        this.workTime = workTime;
        this.salaryHourly = salaryHourly;
    }

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

    public double getSalaryHourly() {
        return salaryHourly;
    }

    public void setSalaryHourly(double salaryHourly) {
        this.salaryHourly = salaryHourly;
    }

    @Override
    public String toString() {
        return "HourlyWorkerImpl{" +
                "name='" + name + '\'' +
                ", workTime=" + workTime +
                ", salaryHourly=" + salaryHourly +
                ", finalSalary=" +getSalary() + '}';
    }

    @Override
    public double getSalary() {
        return workTime*salaryHourly;
    }
}
