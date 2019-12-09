package com.zfs.Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.util.Scanner;

/*声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分*/
public class P06 {


    public static void main(String[] args) {
        int[] score = new int[8];
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 100;
        for (int i = 0 ; i<8 ; i++){
            score[i] = s.nextInt();
            sum = sum + score[i];
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
        }

        System.out.println("sum:" + sum + "  max:"  + max  + "  min:" + min);
    }


}
