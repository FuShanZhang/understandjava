//3.10011101  转换成八进制  和十六进制
public class P03 {

    public static void main(String[] args) {
        int number = 0b10011101;

        System.out.println("八进制 = "+ Integer.toOctalString(number));

        System.out.println("十六进制 = " + Integer.toHexString(number));
    }


}
