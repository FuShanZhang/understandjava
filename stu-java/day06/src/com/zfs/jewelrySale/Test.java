package com.zfs.jewelrySale;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        IEmployee hourlyWorkerA = new HourlyWorkerImpl("张三",200,10);

        IEmployee hourlyWorkerB = new HourlyWorkerImpl("李四",230,10);

        IEmployee salesA = new SalesImpl("王五",5000,4000);

        IEmployee salesB = new SalesImpl("赵六",200000,4000);

        IEmployee employee = new EmployeeImpl("田七",205,10000);

        IEmployee jeweler = new JewelerImpl("三八",30);


        IEmployee[] employees = {hourlyWorkerA,hourlyWorkerB,salesA,salesB,employee,jeweler};

        company.setEmployee(employees);

        company.deleteByName("三八");

        company.showSalaryByName("王五");

        System.out.println(company.toString());

        System.out.println("工资和:" + company.getAllSalary());

    }
}
