import java.io.IOException;

public class Wurzel {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die startzahl ein");
        int anfangszahl = IO.readInteger();
        System.out.println("Gib die endzahl ein");
        int endzahl = IO.readInteger();

        for (int plazhalter = anfangszahl; plazhalter <= endzahl; plazhalter += 1) {
            double wurzel = Math.sqrt(plazhalter);
            System.out.println(wurzel);
        }
    }
}
