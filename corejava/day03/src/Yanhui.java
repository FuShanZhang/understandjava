import java.util.Scanner;

public class Yanhui {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[][] arr =  new int[number][number];
        for(int i = 0 ; i<number ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(j == 0 || i == j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        for(int i = 0 ; i<number ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
