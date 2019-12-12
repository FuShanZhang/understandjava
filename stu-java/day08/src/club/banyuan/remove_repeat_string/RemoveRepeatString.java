package club.banyuan.remove_repeat_string;

import java.util.*;

public class RemoveRepeatString {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.next();

        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            characters.add(str.toCharArray()[i]);
        }

        Iterator iterator = characters.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
