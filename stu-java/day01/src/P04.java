import java.util.Arrays;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int number = s.nextInt();
            arr[i] = number;
        }
        int[] count = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == 0) {
                    cnt2++;
                    break;
                }
                if (arr[i] == arr[j]) {
                    count[i]++;
                    arr[j] = 0;
                    cnt1++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i] + "  " + count[i]);
            }

        }
        System.out.println("0" + "  " + (cnt2 - cnt1 + 1));
    }
}
