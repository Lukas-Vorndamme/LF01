import java.io.IOException;

public class GeometrischeReihe {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die zahl bis wie viel du rechnen willst");
        int n = IO.readInteger();
        double z = 0;
        for(float u = 1; u<=n; u++){
             z += 1/Math.pow(2,u);
            System.out.println("die aktuelle zahl ist " + u+ "und das ergebnis ist "+z);

        }
    }}

