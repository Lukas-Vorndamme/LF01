import java.io.IOException;

public class Ostern {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die jahreszahl ein");
        int jahreszahl = IO.readInteger();
        int resta = jahreszahl % 19;
        int restb = jahreszahl % 4;
        int restc = jahreszahl % 7;
        int m =0;
        int n = 0;

        if(jahreszahl >=1583 && jahreszahl<= 2099 ) {
            m = 23;
        }else if (jahreszahl >= 2100 && jahreszahl <= 2199){
            m = 24;}
        if (jahreszahl >= 1583 && jahreszahl<= 1899){
            n = 3;
        }else if (jahreszahl >= 1900 && jahreszahl <= 2099){
            n = 5;
        }else if (jahreszahl >= 2100 && jahreszahl <= 2199){
            n = 6;
        }
        int restd = (19*resta+m) % 30;

        int reste = (2*restb+4*restc+6*restd+n) % 7;




    }
}
