public class Test3 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.name); // shape
        shape.printType();  //this is circle
        shape.printName();  //sharp
    }
}

class Shape {
    public String name = "shape";

    public Shape(){
        System.out.println("shape constructor"); //1
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    public String name = "circle";

    public Circle() {
        System.out.println("circle constructor"); //2
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}