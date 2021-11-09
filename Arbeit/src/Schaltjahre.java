import java.io.IOException;


public class Schaltjahre {

    public static void main(String[] args) throws IOException {

        boolean wiederholen;

        do {
            System.out.println("Gib ein startjahr ein");
            int jahr = IO.readInteger();
            System.out.println("Gib das jahr ein bis wohin die schltjahre berechnet werden sollen");
            int ende = IO.readInteger();
            for (int i = jahr; i <= ende; i++) {
                if (jahr % 4 == 0 || jahr % 400 == 0) {
                    System.out.println(jahr);
                    jahr++;
                } else  {
                    jahr++;
                }

                }
            System.out.println("Wiederholen?");
            wiederholen = IO.readBoolean();

        } while (wiederholen);
    }
}