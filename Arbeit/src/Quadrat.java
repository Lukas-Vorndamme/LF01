import java.io.IOException;

public class Quadrat {
    public static void main(String[] args) throws IOException {
        System.out.println("wie groß soll das quadrat werden?");
        int n = IO.readInteger();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int a = 2; a < n; a++) {
            for (int i = 0; i <= n + 1; i++) {
                if (i == 0) {
                    System.out.print("*");
                } else if (i == n + 1) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }
}
