import java.io.IOException;

public class Benzinverbrauch {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele kilometer bist du gefahren");
        double km = IO.readDouble();
        System.out.println("Wie viel hat dein auto verbraucht");
        double verbauchstrecke = IO.readDouble();
        if (km == 0) {
            System.out.println("Du bist 0km gefahren also haben sie auch verbrauch");
        } else if (km < 0) {
            System.out.println("Da du eine negative zahl angegeben hast scheinst du keine ahnung von autos zu haben");
        }
       else { double verbauch = 100*(verbauchstrecke/km);
        System.out.println(verbauch);}


    }
}
