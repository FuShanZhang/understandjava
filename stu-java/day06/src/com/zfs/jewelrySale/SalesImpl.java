package com.zfs.jewelrySale;

public class SalesImpl implements IEmployee{

    private String name;
    private double sumSaleVolume;
    private double basicSalary;

    public SalesImpl() {
    }

    public SalesImpl(String name, double sumSaleVolume, double basicSalary) {
        this.name = name;
        this.sumSaleVolume = sumSaleVolume;
        this.basicSalary = basicSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumSaleVolume() {
        return sumSaleVolume;
    }

    public void setSumSaleVolume(double sumSaleVolume) {
        this.sumSaleVolume = sumSaleVolume;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "SalesImpl{" +
                "name='" + name + '\'' +
                ", sumSaleVolume=" + sumSaleVolume +
                ", basicSalary=" + basicSalary +
                ", finalSalary=" +getSalary() +'}';
    }

    @Override
    public double getSalary() {

        double royalty;

        if(sumSaleVolume < 10000){
            royalty = sumSaleVolume*0.1;
        }else if(sumSaleVolume<=100000){
            royalty = sumSaleVolume*0.15;
        }else {
            royalty = sumSaleVolume*0.18;
        }
        return royalty + basicSalary;
    }
}
