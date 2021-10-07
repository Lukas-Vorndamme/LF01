import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GroessenRechnerMeter {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die länge in meter an");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe= br.readLine();

        double m = Double.parseDouble(eingabe.trim().replace(',','.'));
        double mm = m/1000;
        double cm = m/100;
        double dm = m/10;
        double km = m/1000;

        System.out.println("Die leange ist in mm \t" + mm );
        System.out.println("Die leange ist in cm \t" + cm );
        System.out.println("Die leange ist in dm \t" + dm );
        System.out.println("Die leange ist in km \t" + km );

    }
}
