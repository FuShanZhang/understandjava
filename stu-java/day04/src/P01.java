/*从键盘输入一个班5个学生的分数，求和并输出
 */

import java.util.Arrays;
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        System.out.println("请输出5个学生的分数");
        Scanner s = new Scanner(System.in);
        double[] score = new double[5];
        double sumScore = 0.0;
        for (int i = 0; i < 5; i++) {
            score[i] = s.nextInt();
            sumScore += score[i];
        }

        System.out.println("总成绩为:" + sumScore);



    }
}
