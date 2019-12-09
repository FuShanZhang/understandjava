public class A {
    public static void main(String args[]) {
        A a = new A();
        a.method(8);
    }

    void method(int i) {
        System.out.println("int:  " + i);
    }

    void method(long i) {
        System.out.println("long:  " + i);
    }

    Object object = new Object();
}