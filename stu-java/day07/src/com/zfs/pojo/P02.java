package com.zfs.pojo;

import java.util.Calendar;
import java.util.Date;

public class P02 {

    public static void main(String[] args) {

        Date date = new Date(1996 - 1900,11 - 1,30,10,30,30);
        Date date1 = new Date();

        System.out.println(date);


        long passSec = date1.getTime() - date.getTime();

        System.out.println(passSec/1000/3600/24/365);
    }
}
