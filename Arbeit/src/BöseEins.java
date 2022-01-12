import java.io.IOException;

public class BöseEins {
    public static void main(String[] args) throws IOException {
        int spielerPunkte = 0;

        int spieler2Punkte = 0;

        int rundenPrunkte = 0;

        double zufall;

        boolean ok;

        boolean lel;

        do {





            //Spieler 1

            System.out.println("Du bist dran, Spieler 1!");

            do {

                ok = false;

                if (spielerPunkte < 11) {

                    ok = true;

                    if (rundenPrunkte < 11) {

                        zufall = zufall();

                        System.out.println(zufall);

                        if (zufall == 1) {

                            System.out.println("Pech gehabt");

                            break;

                        } else {

                            rundenPrunkte += zufall;

                        }

                    } else {

                        System.out.println("Möchtest du weiter würfeln?");

                        lel = IO.readBoolean();

                        if (lel) {

                            zufall = zufall();

                            System.out.println(zufall);

                            if (zufall == 1) {

                                System.out.println("Pech gehabt");

                                break;

                            } else {

                                rundenPrunkte += zufall;

                                ok = true;

                            }

                        } else {

                            spielerPunkte += rundenPrunkte;

                            System.out.println("Spieler 1 punkte: " + spielerPunkte);

                            break;

                        }

                    }

                }else{

                    System.out.println("Möchtest du weiter würfeln?");

                    lel = IO.readBoolean();

                    if (lel) {

                        zufall = zufall();

                        System.out.println(zufall);

                        if (zufall == 1) {

                            System.out.println("Pech gehabt");

                            break;

                        } else {

                            rundenPrunkte += zufall;

                            ok = true;

                        }

                    } else {

                        spielerPunkte += rundenPrunkte;

                        System.out.println("Spieler 1 punkte: " + spielerPunkte);

                        ok = false;

                    }

                }

            } while (ok);

            rundenPrunkte = 0;

            //Spieler 2

            System.out.println("Du bist dran, Spieler 2!");

            do {

                ok = false;

                if (spieler2Punkte < 11) {

                    ok = true;

                    if (rundenPrunkte < 11) {

                        zufall = zufall();

                        System.out.println(zufall);

                        if (zufall == 1) {

                            System.out.println("Pech gehabt");

                            break;

                        } else {

                            rundenPrunkte += zufall;

                        }

                    } else {

                        System.out.println("Möchtest du weiter würfeln?");

                        lel = IO.readBoolean();

                        if (lel) {

                            zufall = zufall();

                            System.out.println(zufall);

                            if (zufall == 1) {

                                System.out.println("Pech gehabt");

                                break;

                            } else {

                                rundenPrunkte += zufall;

                                ok = true;

                            }

                        } else {

                            spieler2Punkte += rundenPrunkte;

                            System.out.println("Spieler 2 punkte: " + spieler2Punkte);

                            break;

                        }

                    }

                }else{

                    System.out.println("Möchtest du weiter würfeln?");

                    lel = IO.readBoolean();

                    if (lel) {

                        zufall = zufall();

                        System.out.println(zufall);

                        if (zufall == 1) {

                            System.out.println("Pech gehabt");

                            break;

                        } else {

                            rundenPrunkte += zufall;

                            ok = true;

                        }

                    } else {

                        spieler2Punkte += rundenPrunkte;

                        System.out.println("Spieler 2 punkte: " + spieler2Punkte);

                        ok = false;

                    }

                }

            }while (ok);



            rundenPrunkte = 0;

        }while(spieler2Punkte <= 30 && spielerPunkte <= 30);

        System.out.println("Punkte Spieler 1: "+spielerPunkte);

        System.out.println("Punkte Spieler 2: "+spieler2Punkte);

    }



    private static double zufall() {

        double zufall = Math.round(Math.random() * 6 + 0.5);

        return zufall;

    }

}



