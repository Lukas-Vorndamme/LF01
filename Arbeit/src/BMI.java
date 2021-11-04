import java.io.IOException;
import java.util.Objects;

public class BMI {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib dein gewicht ein in kg");
        double gewicht = IO.readDouble();
        System.out.println("Gib deine groesse ein in cm");
        double groesse = IO.readDouble();
        groesse = groesse/100;
        double bmi = gewicht/(groesse*groesse);
        System.out.println("Bist du männlich oder weiblich?");
        String eingabe = IO.readString();

        if (Objects.equals(eingabe, "m")){}
         else if (bmi < 20){
            System.out.println("Du bist untergewichtig");
        }else if (bmi >= 20 && bmi < 25) {
            System.out.println("du bist normal gewichtig ");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Übergewicht");
        }else if (bmi >= 30 && bmi <40){
            System.out.println("Adipositas");
        }else if (bmi >= 40){
            System.out.println("Starke Adipositas");
        }
        if (Objects.equals(eingabe, "w")) {
        }else if (bmi < 19){
                System.out.println("Du bist untergewichtig");
            }else if (bmi >= 19 && bmi < 24) {
                System.out.println("du bist normal gewichtig ");
            }else if (bmi >= 24 && bmi < 30){
                System.out.println("Übergewicht");
            }else if (bmi >= 30 && bmi <40){
                System.out.println("Adipositas");
            }else if (bmi >= 40){
                System.out.println("Starke Adipositas");
            }} }














