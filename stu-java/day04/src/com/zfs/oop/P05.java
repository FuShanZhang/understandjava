package com.zfs.oop;

import java.util.Scanner;

/*请输入一个任意年份,判断是否是闰年
 */
public class P05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("闰年");
        }
    }
}
