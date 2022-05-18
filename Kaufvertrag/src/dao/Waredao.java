package dao;

import java.security.PublicKey;

public class Waredao {
    private final String CLASSNAME ="org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Waredao/src/data/Kaufvertrag.db";


    public Waredao () throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }


}
