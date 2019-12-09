package com.zfs.Array;

import java.util.Scanner;

/*1.任意输入 n行 n列的乘法口诀表*/
public class P01 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1 + "*" + (j+1) + "=" + (i+1)*(j+1) +"   " );
            }
            System.out.println();
        }
    }
}
