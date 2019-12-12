package com.zfs.pojo;

public class P05 {


    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("ABCDEFG");

        System.out.println(s.reverse());

        s.replace(0,5,"");

        System.out.println(s);
    }
}
