package com.zfs.loopAndArray;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*2:数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来*/
public class P02 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[8];
        Scanner s = new Scanner(System.in);
        int number = -1;
        while(!(number >= 0 && number <= 99999999)){
            number = s.nextInt();
        }

        int numberLength = Integer.toString(number).length();
        int startIndex = numberLength;
        for (int i = 8-startIndex; i < 8; i++) {
            arr[i] = (number%(int)Math.pow(10,numberLength) - number%(int)Math.pow(10,numberLength-1))/(int)Math.pow(10,numberLength-1);
            numberLength--;
        }

        Collections.reverse(Arrays.asList(arr));

        for(int i = 0 ; i<8 ; i++){
            if(arr[i] == null){
                arr[i] = 0;
            }
            arr[i]  = (arr[i] + 5)%10;
        }

        int temp = arr[0];
        arr[0] = arr[7];
        arr[7] = temp;

        for(int i = 0 ; i<8 ; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
