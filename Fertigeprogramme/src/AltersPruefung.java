import java.io.IOException;


public class AltersPruefung {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte gib dein alter ein");
        int alter = IO.readInteger();
        if (alter < 18) {
            System.out.println("Du bist Minderjährig");
        }else System.out.println("Du bist Volljährig");


        }
    }

