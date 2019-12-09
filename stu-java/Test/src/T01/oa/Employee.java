package T01.oa;

public class Employee {

    private String name;
    private Integer number;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Integer number, Double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                '}';
    }

    public Double getSumSalary(){
        return salary;
    }
}
