package doudizhu;

import java.util.Arrays;
import java.util.Random;

public class Doudizhu {

    public static void main(String[] args) {

        int[] pai = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,15};

        System.out.println(pai.length);

        int[] player1 = new int[17];
        int[] player2 = new int[17];
        int[] player3 = new int[20];


        int number1,number2;

        for (int i = 0; i<17 ; i++){
            while(true) {
                 number1 = new Random().nextInt(54);
                 number2 = new Random().nextInt(54);
                 if(pai[number1]!= 0 && pai[number2]!=0){
                     break;
                 }
            }
                player1[i] = pai[number1];
                player2[i] = pai[number2];
                pai[number1] = 0;
                pai[number2] = 0;
        }

        System.out.println(Arrays.toString(player1));//农民1
        System.out.println(Arrays.toString(player2));//农名2

        for(int i = 0 ; i<54 ; i++){//地主
            if(pai[i] != 0){
                System.out.print(pai[i] + " ");
            }
        }
        System.out.println();
    }
}
