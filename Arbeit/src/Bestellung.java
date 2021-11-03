import java.io.IOException;

public class Bestellung {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele schrauben vollen sie bestellen");
        int schrauben = IO.readInteger();
        int muttern;
        System.out.println();
        IO.readInteger();
        System.out.println(IO.readInteger()+ "Ist das richtig?" +
                "Es erden gleich viel muttern wie schrauben bestellt" +
                "ist ok? wenn das ok ist antworten sie mit ja");
        IO.readBoolean();


    }
}
