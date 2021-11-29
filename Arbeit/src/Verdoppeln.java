import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {
        double[] m = IO.readArrayDouble();
        System.out.println("uhrsprüngliche daten");
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " \t");
        }
        System.out.println();
        System.out.println("Die verdoppelten daten");
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] * 2 + "\t");
        }

        }

    }

