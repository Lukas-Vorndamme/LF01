import java.io.IOException;

public class ZweigArrays {
    public static void main(String[] args) throws IOException {
        int[][] matrix = IO.readIntArray2D();

        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print( "\t " + anInt);
            }
        }


    }
}
