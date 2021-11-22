import java.io.IOException;

public class Array {
    public static void main(String[] args) throws IOException {
        double[] temp = new double[7];
        double ad = 0;
        double max = 0;
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Gib die Temeratur ein tag "+(i +1) +": ");
            temp[i] = IO.readDouble();
            ad += temp[i];
            if (max < temp[i]) {
                max = temp[i];
            }

        }ad = ad / temp.length;
        System.out.println("Der Mittelwert ist " + ad );
        System.out.println("Die höchste temeratur ist "+ max);
    }
}