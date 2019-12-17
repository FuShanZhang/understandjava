package com.zfs.pojo;

import java.io.*;
import java.util.Arrays;

public class IOIgnoreCap {

    public static void main(String[] args) {

        File file = new File("./a.txt");

        try {
            InputStream is = new FileInputStream("./a.txt");
            OutputStream os = new FileOutputStream("./b.txt");
            byte[] by = new byte[(int)file.length()];
            int count = 0;
            is.read(by);
            for (Byte b : by) {
                if(b == 'l'){
                    by[count] = 'L';
                }
                count++;

            }

            os.write(by);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
