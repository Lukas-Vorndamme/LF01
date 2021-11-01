import java.io.IOException;

public class IOtest  {
    public static void main(String[] args) throws IOException {
        System.out.println("'_'");
       String eingabe = IO.readString();
        System.out.println(eingabe);


        System.out.println(IO.readInteger());
        System.out.println( IO.readDouble());
        System.out.println(IO.readBoolean());

    }
}
