package dao;

import java.util.ArrayList;

  public class Tresor {

  private ArrayList<Gegenstand> gegenstaende;

  public Tresor(ArrayList<Gegenstand> gegenstaende){
      this.gegenstaende = gegenstaende;
  }
  public void addGegenstand(Gegenstand gegenstand){
      gegenstaende.add(gegenstand);
  }

  public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException{
      for (Gegenstand g : gegenstaende){
        if(g.getId() == id) {
            return g;
        }
      }
      throw new GegenstandNichtGefundenException(id);

  }

  public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException{

      if(gegenstaende.contains(gegenstand)){
          gegenstaende.remove(gegenstand);
      }else {
          throw new GegenstandNichtGefundenException(gegenstand.getId());
      }
  }
}
