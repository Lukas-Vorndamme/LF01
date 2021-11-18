import java.io.IOException;

public class PQ_Formel_XXL {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("WIllst du die normale pq_formel odper dei abc formel");
            System.out.println("Gib normal ein für die normale formel und abc für die abc formel");
            String formel = IO.readString();
            if (formel.equalsIgnoreCase("Normal")) {
                System.out.println("Gib p ein");
                double p = IO.readDouble();
                System.out.println(" Gib q ein");
                double q = IO.readDouble();
                double d = Math.pow(p / 2, 2) - q;
                double x1 = -(p / 2) + Math.sqrt(Math.pow(p / 2, 2)) - q;
                double x2 = -(p / 2) - Math.sqrt(Math.pow(p / 2, 2)) - q;
                if (d < 0) {
                    System.out.println("Die rechnung ist nicht möglich");
                } else if (d == 0) {
                    System.out.println(d);
                }else {
                    System.out.println(x1);
                    System.out.println(x2);
                }

            } else if (formel.equalsIgnoreCase("abc")) {
                System.out.println("Gib a an");
                double a = IO.readDouble();
                System.out.println("Gib b an");
                double b = IO.readDouble();
                System.out.println("Gib c an");
                double c = IO.readDouble();
                double d = Math.pow(b, 2 - 4 * a * c);
                double x1 = -(b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                double x2 = -(b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                if (d < 0) {
                    System.out.println("Die rechnung ist nicht möglich");
                } else if (d == 0){
                    System.out.println(-b / (2 * a));
                }else {
                    System.out.println(x1);
                    System.out.println(x2);
                }

            }
            System.out.println("Willst du das programm weiederholen ja oder nein?");

        } while (IO.readBoolean());
    }
}
