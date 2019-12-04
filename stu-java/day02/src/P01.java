import java.util.Scanner;

//手动输入任意三个数，求三个数的和，差
public class P01 {

    public P01() {
    }

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("请输人第一个数");
        int  num1=sc.nextInt();
        System.out.println("请输人第二个数");
        int  num2=sc.nextInt();
        System.out.println("请输人第三个数");
        int  num3=sc.nextInt();


        System.out.println(sum(num1,num2,num3));
        System.out.println(diff(num1,num2,num3));

    }


    public static int sum(int a, int b , int c){
        return a+b+c;
    }

    public static int diff(int a , int b , int c){
        return  a-b-c;
    }
}

