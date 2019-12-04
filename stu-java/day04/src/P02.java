import java.util.Scanner;

/*从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 */
public class P02 {
    public static void main(String[] args) {
        System.out.println("请输入整数");

        Scanner s = new Scanner(System.in);
        Integer decimal = s.nextInt();

        System.out.println(Integer.toBinaryString(decimal));


    }
}
