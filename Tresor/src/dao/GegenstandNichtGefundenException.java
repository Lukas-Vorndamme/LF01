package dao;

public class GegenstandNichtGefundenException extends Exception {
    private int id;
    public GegenstandNichtGefundenException(int id){
        this.id = id;

    }

    public int getId() {
        return id;
    }
    public String getMessage(){
        return "gibt es nicht";
    }
    }
