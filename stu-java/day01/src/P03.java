import java.lang.reflect.Array;
import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {
        String[] arr = new String[]{"1","22","343","343","343","343","343","343","343","343"};
        for(int i = 0; i <arr.length - 1 ; i++){
            for(int j = 0 ; j<arr.length -1 - i ; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //System.out.println(Arrays.toString(arr));

       for(String k : arr){
           System.out.println(k+"  ");
       }

    }
}
