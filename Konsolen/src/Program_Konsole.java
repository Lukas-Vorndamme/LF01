import Objects.Konsolen;
import dao.Konsolendao;

import java.sql.SQLException;

public class Program_Konsole {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Konsolendao konsolendao = new Konsolendao();
        Konsolen konsolen = konsolendao.read("31");

        Konsolen konsolen1 = new Konsolen("X Box Series X",0.00);
        konsolen1.setZubehör("Kühlschrank");
        konsolen1.setMarke("Microsoft");
        konsolendao.delete("3");
        konsolendao.update("1",konsolen);
        konsolendao.insert(konsolen);

        System.out.println(konsolen);

    }
}