import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Regen {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Erfasse die regen wahrscheinlichkeit für april");
        String eingabe = br.readLine();
        double april = Double.parseDouble(eingabe.trim().replace(',', '.'));



        System.out.println("Erfasse die regen wahrscheinlichkeit für mai");
        eingabe = br.readLine();
        double mai = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Erfasse die regen wahrscheinlichkeit für juni");
        eingabe = br.readLine();
        double juni = Double.parseDouble(eingabe.trim().replace(',', '.'));

        double mittelwert = (april + mai + juni) / 3;
        System.out.println("Der Mittelwert der 3 Monate ist \t "  + mittelwert);



}

}

// strg + z = zurück