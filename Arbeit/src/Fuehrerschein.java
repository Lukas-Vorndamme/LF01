import java.io.IOException;

public class Fuehrerschein {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte gib dein alter ein");
        int alter = IO.readInteger();
        if (alter < 14) {
            System.out.println("Du darfst Bobby-Car oder Fahrrad fahre");
        }else if (alter < 16 && alter >=14){
            System.out.println("Du darfst schon 50er fahren");
        }else if (alter >= 16 && alter <18){
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto");
        }else if (alter >= 18){
            System.out.println("Du darfst jetzt auch Auto fahren");
        }





    }
}
