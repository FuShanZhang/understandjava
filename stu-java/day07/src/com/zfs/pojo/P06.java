package com.zfs.pojo;

public class P06 {

    public static void main(String[] args) {

        StringBuilder s =new StringBuilder("ABCDEFG");

        StringBuilder s1 = new StringBuilder(s.substring(0,3));
        s.replace(0,3,s1.reverse().toString());

        System.out.println(s);
    }
}
