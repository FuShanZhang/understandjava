package com.zfs.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。*/
public class P07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner s=  new Scanner(System.in);

        for (int i = 0 ; i< 10 ; i++){
            arr[i] = s.nextInt();
        }

        int number = s.nextInt();

        for (int i = 0 ; i<10 ; i++){
            if(number == arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println("查不到");
    }
}
