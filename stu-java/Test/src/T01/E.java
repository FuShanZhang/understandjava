package T01;

public class E {

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.g(new ClassA());
    }


}

interface InterfaceA{
    String s="good ";
    void f();
}
class ClassA implements InterfaceA{
    public void f(){
        System.out.print(s);
    }
}

class ClassB{
    void g(InterfaceA a){
        a.f();
    }
}
