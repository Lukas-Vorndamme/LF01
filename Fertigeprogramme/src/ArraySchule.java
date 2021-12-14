import java.io.IOException;

public class ArraySchule {
    public static void main(String[] args) throws IOException {

        double[] wert = IO.readArrayDouble();

        for (int i = 0; i < wert.length; i++){
            System.out.println(wert[i]);
        }
    }
}
