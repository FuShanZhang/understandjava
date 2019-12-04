import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        Scanner number = new Scanner(System.in);
        arr[0] = number.nextInt();
        int j = 0;
        for (int i = 1 ; i<10 ; i++){
            arr[i] = number.nextInt();
        }

        for(int i = 1 ; i<10 ; i++){
            for(int k = 1 ;k<i ; k++){
                if(arr[i] == arr[i-1]){
                    arr2[j]++;
                }else{
                    j++;
                }

            }
        }
    }
}
