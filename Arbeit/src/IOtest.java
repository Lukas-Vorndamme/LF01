import java.io.IOException;

public class IOtest {
    public static void main(String[] args) throws IOException {
        System.out.println("'_'");
        System.out.println("Gib irgendwas ein");
        String eingabe = IO.readString();
        System.out.println(eingabe);
        System.out.println("Bitte gib eine ganzzahl ein");
        System.out.println(IO.readInteger());
        System.out.println("Bittegib eine kommazahl ein");
        System.out.println(IO.readDouble());
        System.out.println("Ja oder Nein?");
        System.out.println(IO.readBoolean());


    }
}
