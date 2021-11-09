import java.io.IOException;

public class NoahSchaltjahr {

        public static void main(String[] args) throws IOException {

            boolean ok = true;

            do {

                System.out.println("Gib ein Anfangsjahr ein");

                int anfang = IO.readInteger();

                System.out.println("Gib ein Endjahr ein");

                int ende = IO.readInteger();



                for (int i = anfang; i <= ende; i++) {

                    if (anfang % 4 == 0 || anfang % 400 == 0) {



                        System.out.println(anfang);

                        anfang++;

                    } else {

                        anfang++;

                    }

                }

                System.out.println("nochmal?");

                ok = IO.readBoolean();

            } while (ok);



        }



    }

