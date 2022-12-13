package dao;

public class GegenstandNichtGefundenException extends Exception {

    private int id;

    public GegenstandNichtGefundenException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return "Im Tresor ist kein gegenstand mit der " + id + " zu finden";
    }
}
