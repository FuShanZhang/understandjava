package com.zfs.pojo;

import java.io.*;

/*1.找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用地柜完成)
* 本次使用～路径
* */
public class SearchFileEndNameOfTxt {
    public static void main(String[] args) {


        File file = new File("./");
        searchFile(file);


    }

    public static void searchFile(File file) {
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            for (int i = 0; i < fileArray.length; i++) {
                searchFile(fileArray[i]);
            }
        } else {

            if (file.toString().endsWith(".txt")
            ) {
                try {
                    InputStream is = new FileInputStream(file);
                    OutputStream os = new FileOutputStream("c.txt",true);
                    byte[] by = new byte[(int)file.length()];
                    is.read(by);
                    os.write(by);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(file);
            }
        }
    }
}
