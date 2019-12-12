package com.zfs.pojo;

import java.util.ArrayList;
import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {

        Scanner s=  new Scanner(System.in);

        String str = s.next();

        //byte by = s.nextByte();

        //int indexStart = str.offsetByCodePoints(0,by);

        System.out.println(str.codePointCount(0,str.length()));

    }
}
