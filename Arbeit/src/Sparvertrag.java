import java.io.IOException;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {
        boolean wiederholen;
do {


        System.out.println("Gib dein stertkapital ein");
        double geld = IO.readDouble();
        System.out.println("Gib den zinssatz ein");
        double zinsen = IO.readDouble();
        System.out.println("Gib die laufzeit ein");
        double zeit = IO.readDouble();
        System.out.println("Jahr \t  Anfangskapital \t Zinsbetrag \t Jahresendbetrag");

        for (int i = 1; i<= zeit; i++){
            double zinsbetrag =(geld * (zinsen / 100));
            double jahresbetrag =(geld + zinsbetrag);


            System.out.println( i + "\t\t\t"+ Math.round(geld*100.0)/100.0 + "\t\t\t\t"+ Math.round(zinsbetrag*100.0)/100.0 + "\t\t\t\t" + Math.round(jahresbetrag*100.0)/100.0);
            geld = jahresbetrag;
        }
    System.out.println("Willst du das programm wiederholen?");
        wiederholen = IO.readBoolean();
        }while (wiederholen);
    }
}
