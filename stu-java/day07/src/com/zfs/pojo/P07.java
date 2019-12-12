package com.zfs.pojo;

import java.util.Arrays;

public class P07 {

    public static void main(String[] args) {
        String s = "To be or not to be";

        String[] arr = s.split(" ");


        StringBuilder[] s1 = new StringBuilder[arr.length];
        for (int i = 0; i < arr.length; i++) {
             s1[i]  =  new StringBuilder(arr[i]).reverse();
        }

        String s3 = String.join(" ",s1);

        System.out.println(s3);
    }
}
