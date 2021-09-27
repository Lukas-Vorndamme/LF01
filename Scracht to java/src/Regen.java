import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Regen {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        System.out.println("Erfasse die regen wahrscheinlichkeit für april");
        double april = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println("Erfasse die regen wahrscheinlichkeit für mai");
        double mai = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println("Erfasse die regen wahrscheinlichkeit für juni");
        double juni = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println("Erfasse denn mittelwert der 3 monate");

        double mittelwert = (april + mai + juni) / 3;

}

}

// strg + z = zurück