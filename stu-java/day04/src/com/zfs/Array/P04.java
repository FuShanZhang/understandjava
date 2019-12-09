package com.zfs.Array;

import java.util.Arrays;
import java.util.List;

/*定义一个数组,数组成P员10个,找出数组中最大数连同下标一起输出*/
public class P04 {

    public static void main(String[] args) {
        int[] arr = {1,23,324,324,325,34,325,43,5,213};



        F1:for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    continue F1;
                }else {
                    count++;
                }
            }

            if(count == arr.length){
                System.out.println(arr[i] + "  " + i);
            }
        }
    }
}
