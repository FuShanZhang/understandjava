package com.zfs.pojo;

import java.util.Random;
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int start = s.nextInt();
        int end = s.nextInt();

        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(start-end+1)+end);
        }
    }
}
