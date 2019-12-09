package T01;

abstract class A{
    abstract void f();//2
    public abstract void k();
}
class B extends A{
    protected void f(){    }
    public void k(){
        System.out.print("I am subclass");
    }
    public static void main(String[] args) {
        A a=new B();//1
        a.f();
        a.k();
    }
}