/*5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾*/
public class P05 {

    public static void main(String[] args) {
        String s = "我是你的谁,我是你的剑";

        System.out.println(s.endsWith("剑"));
        System.out.println(s.startsWith("我"));
    }
}
