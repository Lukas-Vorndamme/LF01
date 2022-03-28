import java.io.IOException;

        public class DreiGewinnt {
            public static void main(String[] args) throws IOException {
                    String[][] erzeugen = erzeugen();
                    IO.systemOutPrintStringArray2D(erzeugen);
                    int runde = 1;
                    do {
                        int auswahl = auswahl(erzeugen);
                        erzeugen = spielAblauf(runde, auswahl, erzeugen);
                        IO.systemOutPrintStringArray2D(erzeugen);
                        runde++;
                    }while(true);
                }


                private static String[][] spielAblauf(int runde,int auswahl, String[][] array){
                    int i = array.length - 1;
                    boolean ok = false;
                    do {
                        ok = true;
                        if (array[i][auswahl] == "O"){
                            ok = false;
                            if (runde % 2 == 0){
                                array[i][auswahl] = "X";
                            }else{
                                array[i][auswahl] = "#";
                            }
                        }else{
                            i--;
                        }
                    }while(ok);
                    return array;
                }

                private static int auswahl(String[][] array) throws IOException {
                    boolean ok;
                    int auswahl;
                    do {
                        ok = false;
                        System.out.println();
                        System.out.println("In welche Röhre soll deine Kugel geworfen werden?");
                        auswahl = IO.readInteger();
                        if (auswahl > array.length){
                            System.out.println("Bitte eine Zahl eingeben die sich innerhalb der Größe des Spielfeldes befindet");
                            ok = true;
                        }
                    }while(ok);
                    return auswahl;
                }

                private static String[][] erzeugen() throws IOException {
                boolean o;
                    int groesse = 0;

                    do {
                    o = false;
                    System.out.println("Wie groß soll das Spielfeld sein?");
                    System.out.println("3x3: 1");
                    System.out.println("4x4: 2");
                    System.out.println("5x5: 3");
                    int auswahl = IO.readInteger();
                    if (auswahl == 1) {
                        groesse = 3;
                    } else {
                        if (auswahl == 2) {
                            groesse = 4;
                        } else {
                            if (auswahl == 3) {
                                groesse = 5;
                            } else {
                                System.out.println("Bitte nochmal versuchen");
                                o = true;
                            }
                        }
                    }
                }while (o);



                    String[][] erstellen = new String[groesse][groesse];
                    for (int i = 0; i < erstellen.length; i++) {
                        for (int j = 0; j < erstellen.length; j++) {
                            erstellen[i][j] = "O";
                        }
                    }
                    return erstellen;
                }
            }