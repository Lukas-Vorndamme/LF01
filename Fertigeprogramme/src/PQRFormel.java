import java.io.IOException;

public class PQRFormel {
    public static void main(String[] args) throws IOException {

        boolean wiederholen;
        do {
        System.out.println("Gib p ein");
        double p = IO.readDouble();
        System.out.println(" Gibh q ein");
        double q = IO.readDouble();
        double d = Math.pow(p/2,2)-q;
        double x1 = -(p/2)+ Math.sqrt(Math.pow(p/2,2))-q;
        double x2 = -(p/2)- Math.sqrt(Math.pow(p/2,2))-q;
        if (d <= 0){
            System.out.println("Die rechnung ist nicht möglich");
        }else{ System.out.println(x1); System.out.println(x2);}
            System.out.println("Willst du das programmm wiederholen?");
        wiederholen = IO.readBoolean();
        }while (wiederholen);







        }

    }


