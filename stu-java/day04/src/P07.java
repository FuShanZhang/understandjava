import java.util.Scanner;

/*输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）*/
public class P07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer number = s.nextInt();

        int count1 = number.toString().length();


        int reversalNumber = 0;
        int count2 = 0;

        while(count1 > 0){

            reversalNumber += ((number%((int)(Math.pow(10,count1))) -number%((int)(Math.pow(10,count1-1))))/(int)Math.pow(10,count1 -1))  * (int)Math.pow(10,count2);


            count1--;
            count2++;
        }

        System.out.println(reversalNumber);

    }



}
