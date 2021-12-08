import java.io.IOException;

public class MartinArrays {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die länge der zeilen ein");
        int zeilen= IO.readInteger();
        System.out.println("Gibn die länge der spalten ein");
        int spalten = IO.readInteger();

        int[][] matrix = new int[zeilen][spalten];

        for (int i = 0; i < matrix.length;i++){
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("Gib die werte für die stelle" + i + j + "ein  :");
                matrix[i][j] =IO.readInteger();
            }
        }
        for (int i = 0;i < matrix.length;i++){
            System.out.println();
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
        }

    }
}
