package businessObjects;

import java.util.ArrayList;

public class Ware {

	private int warenNr;
	private String bezeichnung;
	private String beschreibung;
	private double preis;
	private ArrayList<String> besonderheitenListe;
	private ArrayList<String> maengelListe;

	/**
	 * Konstruktor.
	 * @param bezeichnung	Die Bezeichnung der businessObjects.Ware.
	 * @param preis			Der Preis der businessObjects.Ware.
	 */
	public Ware(String bezeichnung, double preis) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		besonderheitenListe = new ArrayList<String>();
		maengelListe = new ArrayList<String>();

	}

	public void setWarenNr(int warenNr) {
		this.warenNr = warenNr;
	}

	public int getWarenNr() {
		return warenNr;
	}

	/**
	 * Gibt die Bezeichnung der businessObjects.Ware aus.
	 * @return	Die Bezeichnung der businessObjects.Ware.
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * Aktualisiert die Bezeichnung der businessObjects.Ware.
	 * @param bezeichnung	Die neue Bezeichnung der businessObjects.Ware.
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	/**
	 * Gibt die Beschreibung der businessObjects.Ware aus.
	 * @return	Die Beschreibung der businessObjects.Ware.
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * Aktualisiert die Beschreibung der businessObjects.Ware.
	 * @param beschreibung	Die neue Beschreibung der businessObjects.Ware.
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	/**
	 * Gibt den Preis der businessObjects.Ware aus.
	 * @return	Der Preis der businessObjects.Ware.
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * Aktualisiert den Preis der businessObjects.Ware.
	 * @param preis	Der neue Preis der businessObjects.Ware.
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * Gibt die Liste der Besonderheiten der businessObjects.Ware aus.
	 * @return	Die Liste der Besonderheiten der businessObjects.Ware.
	 */
	public ArrayList<String> getBesonderheitenListe() {
		return besonderheitenListe;
	}

	/**
	 * Gibt die Liste der Mängel der businessObjects.Ware aus.
	 * @return	Die Liste der Mängel der businessObjects.Ware.
	 */
	public ArrayList<String> getMaengelListe() {
		return maengelListe;
	}


	public void setBesonderheitenListe(ArrayList<String> besonderheitenListe) {
		this.besonderheitenListe = besonderheitenListe;
	}

	public void setMaengelListe(ArrayList<String> maengelListe) {
		this.maengelListe = maengelListe;
	}


	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		String text = bezeichnung;
		text += "\n\t\tBeschreibung: " + beschreibung;
		text += "\n\t\tPreis: " + preis;
		text += "\n\t\tBesonderheiten: " + besonderheitenListe;
		text += "\n\t\tMängel: " + maengelListe;
		return text;
	}
	
}
