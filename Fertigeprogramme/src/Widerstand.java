import java.io.IOException;
import java.util.Objects;

public class Widerstand {
    public static void main(String[] args) throws IOException {
        System.out.println("Handelt es sich um eine reihe oder parallel schaltung");
        System.out.println("p für Parallel und r für Reihe");
       String eingaeb =  IO.readString();
        System.out.println(" Gib den ersten widerstände ein");
        double r1 = IO.readDouble();
        System.out.println("Gib den zweiten widerstand an");
        double r2 = IO.readDouble();
        if (eingaeb.equals("p")){
            double widerstandP = (r1*r2)/(r1+r2);
            System.out.println(widerstandP);}
        else if (eingaeb.equals("r")){
            double wiederstandR = r1 + r2;
            System.out.println(wiederstandR);}

        }
    }

