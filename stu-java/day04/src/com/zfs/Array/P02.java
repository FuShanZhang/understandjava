package com.zfs.Array;

/*2.输入三个班，每班10个学生的成绩，求每个班的总分和平均分*/
public class P02 {


    public static void main(String[] args) {
        double[] class1 = {12,123,12,312,3,13,2,3,1,321};
        double[] class2 = {12,123,12,11,3,13,2,3,1,321};
        double[] class3 = {12,123,12,11,3,13,2,3,1,321};


        System.out.println(sum(class1));
        System.out.println(avg(class1));

    }

    public  static double sum(double[] arr){
        double sum  = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public  static double avg(double[] arr){
        return sum(arr)/10;
    }
}
