package com.zfs.jewelrySale;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

    private ArrayList<IEmployee> employees;
    private IEmployee[] employee ;

    public Company() {
    }

    public Company(IEmployee[] employee) {
        this.employee = employee;
    }

    public IEmployee[] getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee[] employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + Arrays.toString(employee) +
                '}';
    }

    public void deleteByName(String name){

        IEmployee[] employees = new IEmployee[employee.length - 1];

        for(int i = 0 ; i<employee.length ; i++){
            if(!this.employee[i].getName().equals(name)){
                employees[i] = this.employee[i];
            }
        }

        this.employee = employees;
    }

    public double showSalaryByName(String name){
        for(int i = 0 ; i<employee.length ; i++){
            if(this.employee[i].getName().equals(name)){
                return this.employee[i].getSalary();
            }
        }
        return 0;
    }

    public double getAllSalary(){
        double allSalary = 0;
        for(int i = 0 ; i<employee.length ; i++){
            allSalary = allSalary + employee[i].getSalary();
        }

        return allSalary;
    }

}
