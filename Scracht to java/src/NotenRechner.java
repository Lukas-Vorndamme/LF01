
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotenRechner {
    public static void main(String[] args)  throws IOException {
        {
            System.out.println("Wie viel Prozent wurden erreicht ohne % zeichen");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String eingabe = br.readLine();

            double Prozent = Double.parseDouble(eingabe.trim().replace(',', '.'));

             if (Prozent < 27)

                System.out.println("Die Note 6 wurde erreicht");

              else if (Prozent >= 27 && Prozent <= 44)

                System.out.println("Die Note 5 wurde erreicht");

            if (Prozent == 27)

                System.out.println("Die Note 5 wurde erreicht");

            else if (Prozent >= 45 && Prozent <= 59)

                System.out.println("Die Note 4 wurde erreicht");

            else if (Prozent == 45)

                System.out.println("Die Note 4 wurde erreicht");

            else if (Prozent >= 58 && Prozent < 73)

                System.out.println("Die Note 3 wurde erreicht");

            else if (Prozent == 59)

                System.out.println("Die Note 3 wurde erreicht");

            else if (Prozent > 73 && Prozent <= 84)

                System.out.println("Die Note 2 wurde erreicht");

            else if (Prozent == 73)

                System.out.println("Die Note 2 wurde erreicht");

            else if (Prozent > 84)
                System.out.println("Die Note 1 wurde erreicht");


        }

    }}



