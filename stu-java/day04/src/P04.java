import java.util.Scanner;

/*找出能被5或6整除，但不能被两者同时整除的数*/
public class P04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        if((number % 5==0 || number % 6 ==0) && !(number % 5==0 && number % 6 ==0)){
            System.out.println(number + "能被5或6整除，但不能被两者同时整除");
        }else {
            System.out.println("error");
        }
    }
}
