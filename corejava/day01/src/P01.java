import java.time.LocalDate;
import java.util.Date;

public class P01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int count = date.getDayOfMonth();
        System.out.println(count);
    }
}

