import java.io.IOException;

public class Ostern {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die jahreszahl ein");

        int m =0;
        int n = 0;
        boolean wiederholen;
        do{
            int jahreszahl = IO.readInteger();
            int resta = jahreszahl % 19;
            int restb = jahreszahl % 4;
            int restc = jahreszahl % 7;
        if(jahreszahl >=1583 && jahreszahl<= 2099 ) {
            m = 23;
        }else if (jahreszahl >= 2100 && jahreszahl <= 2199){
            m = 24;}
        if (jahreszahl >= 1583 && jahreszahl<= 1799) {
            n = 3;
        }else if (jahreszahl>=1800 && jahreszahl <= 1899){
            n = 4;
        }else if (jahreszahl >= 1900 && jahreszahl <= 2099){
            n = 5;
        }else if (jahreszahl >= 2100 && jahreszahl <= 2199){
            n = 6;
        }
        int restd = (19*resta+m) % 30;

        int reste = (2*restb+4*restc+6*restd+n) % 7;
        int ostern = 22+restd+reste;
        int ostern2 = restd+reste-9;
        if (ostern <= 31){
        System.out.println("ostern ist in dem angegebenen jahr am " + ostern + " märz");

        } else if (ostern > 32){
        System.out.println("ostern ist in dem angegebenen jahr am " + ostern2 + " april");

        } else if (ostern2 == 26) {
            System.out.println("ostern ist in dem angegebenen jahr am 19 april");

        }else if (restd == 28 && reste == 6 && (11 * m +11 % 30) <19 && ostern2 == 25){
            System.out.println("ostern ist in dem angegebenen jahr am 18 april");
        }
            System.out.println("Willst du noch ein weiteres jahr ausrechnen?");
        wiederholen = IO.readBoolean();
    }while (wiederholen);
}}
