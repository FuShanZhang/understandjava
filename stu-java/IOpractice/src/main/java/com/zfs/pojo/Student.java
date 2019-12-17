package com.zfs.pojo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("张三",123);
        System.out.println(student.toString());
        File file = new File("./student.txt");
        byte[] by = new byte[(int)file.length()];
        by = (student.getName() +"\n" +student.getAge()).getBytes();
        try {
            OutputStream os = new FileOutputStream(file);
            os.write(by);
            /*int c = is.read();
            while(c != '\n'){
                os.write(c);
                c = is.read();
            }*/
            InputStream is = new FileInputStream(file);
            int c = is.read();
            int count = 0;
            ArrayList<Byte> arrayList1 = new ArrayList<>();
            ArrayList<Byte> arrayList2 = new ArrayList<>();
            boolean zfs = true;
            while(c != -1){
                if(c != '\n' && zfs){
                    count++;
                    arrayList1.add((byte)c);
                    c = is.read();
                }else if (c == '\n' && zfs){
                    zfs = false;
                    c = is.read();
                }else if(!zfs){
                    arrayList2.add((byte)c);
                    c = is.read();
                }
            }
            Byte[] bytes = new Byte[arrayList1.size()];
            arrayList1.toArray(bytes);
            byte[] bytes1 = new byte[bytes.length];
            for(int i = 0 ; i<bytes.length ; i++){
                 bytes1[i] = bytes[i];
            }

            Byte[] bytes2 = new Byte[arrayList2.size()];
            arrayList2.toArray(bytes2);
            byte[] bytes3 = new byte[bytes2.length];
            for(int i = 0 ; i<bytes3.length ; i++){
                bytes3[i] = bytes2[i];
            }
            Student student1 = new Student(new String(bytes1),new Integer(new String(bytes3)));
            System.out.println(arrayList1);
            System.out.println(arrayList2);
            System.out.println(student1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
