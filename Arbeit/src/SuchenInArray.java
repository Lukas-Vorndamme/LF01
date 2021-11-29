import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte gib ein Array mit 5 Kommazahlen ein");
        int n = 5;
        double[] m = IO.readArrayDouble(n);

        System.out.print("Nach welcher zahl wollen  sie suchen :");
       double k = IO.readDouble();
       for (int i = 0; i < n; i++ )
        if (k == m[i]){
            System.out.println("Treffer ");
        }else System.out.println("Niete");

}}
