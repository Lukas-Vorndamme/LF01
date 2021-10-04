import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung2 {

    public static void main(String[] args) throws IOException {

        System.out.print("Wie lange ist die hypotenuse? (Längste seite)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String eingabe = br.readLine();
        double hypotenuse = Double.parseDouble(eingabe.trim().replace(',', '.'));


        System.out.print("Wie lange ist die ankathete an");
        String eingabe1 = br.readLine();
        double ankathete = Double.parseDouble(eingabe1.trim().replace(',', '.'));

        System.out.print("Wie lange ist die gegenkathete an");
        String eingabe2 = br.readLine();
        double gegenkathete = Double.parseDouble(eingabe2.trim().replace(',', '.'));

        double U = gegenkathete + ankathete +hypotenuse;
        double S = U / 2;
        double A = Math.sqrt( S *(S - ankathete) * (S-gegenkathete) * (S-hypotenuse));

        if (ankathete + gegenkathete < hypotenuse && ankathete + hypotenuse < gegenkathete && gegenkathete + hypotenuse < ankathete)
            System.out.print("Das dreick funktioniert nicht");
        if (ankathete + gegenkathete >= hypotenuse && ankathete + hypotenuse > gegenkathete && gegenkathete + hypotenuse > ankathete)
            System.out.print("Das dreick funktioniert \t " + A  );


    }
}