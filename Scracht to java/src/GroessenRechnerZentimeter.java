import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroessenRechnerZentimeter {
    public static void main(String[] args) throws IOException {
        System.out.println("Gibt die leange in cm an");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe= br.readLine();

        double cm = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double mm = cm*10;
        double dm = cm/10;
        double m = cm/100;
        double km = cm/ 100000;

        System.out.println("Die leange ist in mm \t" + mm );
        System.out.println("Die leange ist in dm \t" + dm );
        System.out.println("Die leange ist in m \t" + m );
        System.out.println("Die leange ist in km \t" + km );


    }
}

