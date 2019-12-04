/*已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
int   a=2;
int  b=3;
int  c=a;

a=b;
b=c;


a=a+b;
b=a-b;*/
public class P06 {
    public static void main(String[] args) {


    int a = 2;
    int b = 3;

    a = a^b;
    b = a^b;
    a = a^b;

        System.out.println(a + "  " + b);
}
}
