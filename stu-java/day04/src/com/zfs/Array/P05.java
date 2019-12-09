package com.zfs.Array;

import java.util.Arrays;
import java.util.Scanner;

/*输入10个整数存入数组，然后复制到b数组中输出*/
public class P05 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }

        int[] b = arr;


        System.out.println(Arrays.toString(b));
    }
}
