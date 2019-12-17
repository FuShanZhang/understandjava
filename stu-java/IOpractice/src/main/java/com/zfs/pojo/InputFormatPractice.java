package com.zfs.pojo;

import java.io.*;
import java.util.Scanner;

//2.利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
//题目是输出把
public class InputFormatPractice {

    public static void main(String[] args) {

        try {
            //InputStream is = new FileInputStream("./");
            Scanner s= new Scanner(System.in);
            byte[] bytes = s.next().getBytes();
            OutputStream os =  new FileOutputStream("./c.txt");
           /* int c = os.write(bytes);
            while(bytes == -1)*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
