package com.zfs.loopAndArray;

import java.util.Scanner;

/*

    某公司按照季度和月份统计的数据如下：单位(万元)
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99
* */
public class P03 {


    public static void main(String[] args) {
        int[] arr = {226644,773388,254565,116699};
        int sumSaleVolume = 0;
        int i = 0;
        for(int a : arr){
            sumSaleVolume = sumSaleVolume + arr[i];
            i++;
        }

        System.out.println(sumSaleVolume);
    }

}
