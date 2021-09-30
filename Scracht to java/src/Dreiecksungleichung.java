import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {
    public static void main(String[] args) throws IOException {
        System.out.print("Wie lange ist die hypotenuse? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String eingabe = br.readLine();
        double hypotenuse = Double.parseDouble(eingabe.trim().replace(',', '.'));


        System.out.print("Wie lange sidn die kathete1 an");
        String eingabe1 = br.readLine();
        double kathete1 = Double.parseDouble(eingabe1.trim().replace(',', '.'));

        System.out.print("Wie lange sidn die kathete2 an");
        String eingabe2 = br.readLine();
        double kathete2 = Double.parseDouble(eingabe2.trim().replace(',', '.'));
        double s = 0.5 * (kathete1 + hypotenuse + kathete2);
        double h = (2/kathete1) * Math.sqrt(s * (s-kathete1) * (kathete2) * (s-hypotenuse));
        double flaeche = hypotenuse * h /2;

        if (kathete1 + kathete2 < hypotenuse) System.out.print("Das dreick funktioniert nicht");
        if (kathete1 + kathete2 > hypotenuse) System.out.print("Das dreick funktioniert \t " + flaeche);



    }
}