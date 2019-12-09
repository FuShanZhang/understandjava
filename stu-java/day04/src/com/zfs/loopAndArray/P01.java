package com.zfs.loopAndArray;

import java.util.Scanner;

/*1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。*/
public class P01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countOddNumber = 0;
        int countEvenNumber = 0;
        do{
            int number = s.nextInt();
            if((number <= 0 || number>=100000) && number!= -1){
                System.out.println("超出范围");
            }else if(number != -1){
                if(number%2 == 0){
                    countEvenNumber++;
                }else {
                    countOddNumber++;
                }
            }else {
                break;
            }
        }while (true);

        System.out.println(countOddNumber + " " + countEvenNumber);
    }
}
