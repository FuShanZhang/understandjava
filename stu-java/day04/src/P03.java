import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*输入一批整数，使用循环求出最大值与最小值，输入0时结束。*/
public class P03 {
    public static void main(String[] args) {
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};

        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));

        System.out.println("最大值是:" + max + ",最小值是: " + min);

    }


}
