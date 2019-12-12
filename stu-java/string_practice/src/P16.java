import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组*/
public class P16 {

    public static void main(String[] args) {
        byte[] by = {123,21,24,56};

        String s=  new String(by, StandardCharsets.UTF_8);

        String s1=  new String(by, StandardCharsets.ISO_8859_1);

        byte[] by1 = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(by1));
    }
}
