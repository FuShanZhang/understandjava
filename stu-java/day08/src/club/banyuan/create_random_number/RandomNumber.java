package club.banyuan.create_random_number;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {


    public static void main(String[] args) {

        Set<Integer>  number = new HashSet<>();

        do{
            number.add((int)(Math.random()*19 + 1));
        }while(number.size() <= 10);


        System.out.println(number);
    }
}
