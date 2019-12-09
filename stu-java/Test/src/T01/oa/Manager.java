package T01.oa;

public class Manager extends Employee{

    private String name;
    private Integer number;
    private Double salary;
    private Double bonus;

    public Manager(){

    }


    public Manager(String name, Integer number, Double salary, Double bonus) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.bonus = bonus;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    public Double getSumSalary(){
        return this.salary + this.bonus;
    }


}
