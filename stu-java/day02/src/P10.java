import java.util.Scanner;

public interface P10{
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);

        int x  = s.nextInt();
        System.out.println(x%2 == 0?"偶数":"奇数");
    }
}


