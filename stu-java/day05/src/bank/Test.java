package bank;

public class Test {


    public static void main(String[] args) {
        Customer customer = new Customer("jane","Smith");
        customer.setAccount(new Account(1000,2000,0.0123));

        System.out.println(customer.toString());
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println(customer.display());
    }

}
