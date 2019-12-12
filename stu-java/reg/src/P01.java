import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class P01 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        ArrayList arrayList = new ArrayList();

        arrayList.add(213);
        arrayList.add(213);

        Integer[] k = new Integer[3];

        System.out.println(Arrays.toString(arrayList.toArray(k)));

    }
}
