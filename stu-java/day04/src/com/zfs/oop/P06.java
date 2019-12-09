package com.zfs.oop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数*/
public class P06 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] arrNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrNum[i] = r.nextInt(30);
        }

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if(num == arrNum[i]){
                count++;
            }
        }

        System.out.println(Arrays.toString(arrNum));


        System.out.println(count);
    }
}
