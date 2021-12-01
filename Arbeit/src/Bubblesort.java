import java.io.IOException;

public class Bubblesort {
    public static void main(String[] args) throws IOException {
        int[] zahlen = IO.readArrayInteger();
        boolean w = false;
        System.out.println("Willst du von groß nach klein oder von kleien nach groß");
        System.out.println("G = Groß  K = Klein");
        String a = IO.readString();

        if (a.equalsIgnoreCase("g")){
            do {
                w  =false;
                for (int i = 0; i < zahlen.length -1; i++){
                    if (zahlen[i] > zahlen[i+1]){
                        int temp = zahlen[i];
                        zahlen[i] = zahlen[i+1];
                        zahlen[i +1] = temp;
                        w = true;
                    }
                }
            }while (w);

            for (int i = 0; i < zahlen.length; i++){
                System.out.println(zahlen[i] +"\t");
            }
        }else if (a.equalsIgnoreCase("k")){
            do {
                w  =false;
                for (int i = 0; i < zahlen.length -1; i++){
                    if (zahlen[i] < zahlen[i+1]){
                        int temp = zahlen[i];
                        zahlen[i] = zahlen[i+1];
                        zahlen[i +1] = temp;
                        w = true;
                    }
                }
            }while (w);

            for (int i = 0; i < zahlen.length; i++){
                System.out.println(zahlen[i] +"\t");
            }
        }










      }


}
