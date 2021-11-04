import java.io.IOException;

public class Fakultaet {
    public static void main(String[] args) throws IOException {
        System.out.println("gib die startzahl ein");
        int zahl = IO.readInteger();
        System.out.println("Gib die endzahl ein");
        int ende = IO.readInteger();
        for (int quadrat = zahl; quadrat <= ende; quadrat+=1){
            double ergebnis = quadrat*quadrat;
            System.out.println(ergebnis);
        }
    }
}
