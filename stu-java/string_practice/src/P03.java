/*3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写*/
public class P03 {

    public static void main(String[] args) {
        String s1 ="abcdw";
        String s2 = "ABCDw";

        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
