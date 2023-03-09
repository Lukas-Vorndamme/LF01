import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GegenstandDao {

    private Map<String , Gegenstand> gegenstandMap = new HashMap<>();

    public void insert(Gegenstand gegenstand) throws GegenstandVorhandenExeption{
        if(gegenstandMap.containsKey(gegenstand.getNr())){
            throw new GegenstandVorhandenExeption();
        }
    };

    public Gegenstand findById(String nr) throws GegenstandNichtVorhandenExeption {
    if(!gegenstandMap.containsKey(nr)){
        throw new GegenstandNichtVorhandenExeption();
    }
    return gegenstandMap.get(nr);
    };
    public List<Gegenstand> findAll(){
        return gegenstandMap.values().stream().toList();
    }
    public void update(Gegenstand gegenstand) throws GegenstandNichtVorhandenExeption{
        if(!gegenstandMap.containsKey(gegenstand)){
            throw new GegenstandNichtVorhandenExeption();
        }
        gegenstandMap.replace(gegenstand.getNr(), gegenstand);
    };
    public void delete(String nr) throws GegenstandNichtVorhandenExeption{
        if(!gegenstandMap.containsKey(gegenstandMap)){
            throw new GegenstandNichtVorhandenExeption();
        }
        gegenstandMap.remove(nr);
    };
}
