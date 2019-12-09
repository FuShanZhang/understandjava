package com.zfs.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*  有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
0  1  2  3  4  5  6  7  8  9

   随机30个数字 */
public class P09 {


    public static void main(String[] args) {
        int[] arr = new int[30];

        for(int i = 0; i<arr.length ; i++){
            arr[i] = new Random().nextInt(10);
        }

        int singleDigit[] = {0,1,2,3,4,5,6,7,8,9};
        int count[] = new int[10];

        for(int i = 0 ; i<10 ; i++){
            for (int j = 0; j < 30; j++) {
                if(singleDigit[i] == arr[j]){
                    count[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(singleDigit));
        System.out.println(Arrays.toString(count));
    }
}
