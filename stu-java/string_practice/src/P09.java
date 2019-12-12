/*9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"*/
public class P09 {

    public static void main(String[] args) {
        String s ="我是你的谁,我是你的剑";

        System.out.println(s.lastIndexOf("你"));
        System.out.println(s.indexOf("你",3));
    }
}
