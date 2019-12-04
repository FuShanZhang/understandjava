import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer,Integer> countNum = new HashMap<>();

        int[] cnt = new int[10];
        int j = 1;
        for(int i = 0 ; i<10 ; i++){
            int num = s.nextInt();
            if(countNum.containsKey(num)){
                int value = countNum.get(num);
                value++;
                countNum.put(num,value);
                continue;
            }
            countNum.put(num,1);
        }

        countNum.forEach((k,v)->{
            System.out.println("key ="+ k + ", value ="+v);
        });
    }
}
