import java.io.IOException;

public class Temperaturmessungen {
    public static void main(String[] args) throws IOException {
        boolean wiederholen;
        do {
            System.out.println("Gib die Temerautren der wochen ein");
            System.out.print("Tag 1 :");
            double tag1 = IO.readDouble();
            System.out.print("Tag 2 :");
            double tag2 = IO.readDouble();
            System.out.print("Tag 3 :");
            double tag3 = IO.readDouble();
            System.out.print("Tag 4 :");
            double tag4 = IO.readDouble();
            System.out.print("Tag 5 :");
            double tag5 = IO.readDouble();
            System.out.print("Tag 6 :");
            double tag6 = IO.readDouble();
            System.out.print("Tag 7 :");
            double tag7 = IO.readDouble();

            double mittelwert = (tag1 + tag2 + tag3 + tag4 + tag5 + tag6 + tag7) / 7;
            double max = 0;
            if (tag1 > tag2 && tag1 > tag3 && tag1 > tag4 && tag1 > tag5 && tag1 > tag6 && tag1 > tag7) {
                max = tag1;
            } else if (tag2 > tag1 && tag2 > tag3 && tag2 > tag4 && tag2 > tag5 && tag2 > tag6 && tag2 > tag7) {
                max = tag2;
            } else if (tag3 > tag2 && tag3 > tag1 && tag3 > tag4 && tag3 > tag5 && tag3 > tag6 && tag3 > tag7) {
                max = tag3;
            } else if (tag4 > tag2 && tag4 > tag3 && tag4 > tag1 && tag4 > tag5 && tag4 > tag6 && tag4 > tag7) {
                max = tag4;
            } else if (tag5 > tag2 && tag5 > tag3 && tag5 > tag4 && tag5 > tag1 && tag5 > tag6 && tag5 > tag7) {
                max = tag5;
            } else if (tag6 > tag2 && tag6 > tag3 && tag6 > tag4 && tag6 > tag5 && tag6 > tag1 && tag6 > tag7) {
                max = tag6;
            } else if (tag7 > tag2 && tag7 > tag3 && tag7 > tag4 && tag7 > tag5 && tag7 > tag6 && tag7 > tag1) {
                max = tag7;
            }
            System.out.println("Der Mittelwert der temperarautren ist " + mittelwert);
            System.out.println("Der Maximale wert der temperaturen ist " + max);
            System.out.println("Willst du das programm wiederholen");
            wiederholen = IO.readBoolean();

        } while (wiederholen);


    }
}