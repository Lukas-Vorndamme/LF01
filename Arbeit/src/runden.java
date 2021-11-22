import java.io.IOException;
import java.text.DecimalFormat;

public class runden {
    public static void main(String[] args) throws IOException {

        DecimalFormat f = new DecimalFormat("#0.00");
        int n = 20;
        System.out.println(f.format(20));

    }
}
