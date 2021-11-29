import java.io.IOException;

public class Maxima {
    public static void main(String[] args) throws IOException {
        double[] a = IO.readArrayDouble();

        int index1 = 0;
        double max1 = Integer.MIN_VALUE;
        double max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                index1 = i;
                max1 = a[i];
            }
        }

        a[index1] = a[index1] + a[0] - (a[0] = a[index1]);

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max2) {
                max2 = a[i];
            }
        }

        a[index1] = a[index1] + a[0] - (a[0] = a[index1]);

        System.out.println("Der Größte wert ist = " + max1);
        System.out.println("Der Zweit größte wert ist  = " + max2);}}

