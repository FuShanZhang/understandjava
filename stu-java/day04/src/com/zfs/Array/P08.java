package com.zfs.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*在一个数组中找出最大和最小值，并输出它们的位置*/
public class P08 {



    public static void main(String[] args) {
        int[] arr = {0,1,2,23,4,5,5};

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("max " + max + "maxIndex " +maxIndex);
        System.out.println("min " + min + "minIndex " +minIndex);
    }
}
