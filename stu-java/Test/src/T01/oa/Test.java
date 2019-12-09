package T01.oa;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Manager("张三",123,3000.0,300.0);

        System.out.println(employee.getSumSalary());

    }
}
