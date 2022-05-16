package businessObjects;

public class Kaufvertrag {

	private Vertragspartner verkaeufer;
	private Vertragspartner kaeufer;
	private Ware ware;
	private String zahlungsModalitaeten;

	/**
	 * Konstruktor.
	 * @param verkaeufer	Der Verkäufer.
	 * @param kaeufer		Der Käufer.
	 * @param ware			Die businessObjects.Ware.
	 */
	public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) {
		this.verkaeufer = verkaeufer;
		this.kaeufer = kaeufer;
		this.ware = ware;
	}

	/**
	 * Gibt den Verkäufer aus.
	 * @return	Der Verkäufer.
	 */
	public Vertragspartner getVerkaeufer() {
		return verkaeufer;
	}

	/**
	 * Gibt den Käufer aus.
	 * @return	Der Käufer.
	 */
	public Vertragspartner getKaeufer() {
		return kaeufer;
	}

	/**
	 * Ändert den Käufer.
	 * @param kaeufer	Der neue Käufer.
	 */
	public void setKaeufer(Vertragspartner kaeufer) {
		this.kaeufer = kaeufer;
	}

	/**
	 * Gibt die businessObjects.Ware aus.
	 * @return	Die businessObjects.Ware.
	 */
	public Ware getWare() {
		return ware;
	}

	/**
	 * Ändert die businessObjects.Ware.
	 * @param ware	Die neue businessObjects.Ware.
	 */
	public void setWare(Ware ware) {
		this.ware = ware;
	}

	/**
	 * Gibt die Zahlungsmodalitäten aus.
	 * @return	Die Zahlungsmodalitäten.
	 */
	public String getZahlungsModalitaeten() {
		return zahlungsModalitaeten;
	}

	/**
	 * Ändert die Zahlungsmodalitäten.
	 * @param zahlungsModalitaeten	Die neuen Zahlungsmodalitäten.
	 */
	public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
		this.zahlungsModalitaeten = zahlungsModalitaeten;
	}

	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		String text = "businessObjects.Kaufvertrag: ";
		text += "\n\tVerkäufer: " + verkaeufer;
		text += "\n\tKäufer: " + kaeufer;
		text += "\n\tbusinessObjects.Ware: " + ware;
		text += "\n\tZahlungsmodalitäten: ";
		text += "\n\t\t" + zahlungsModalitaeten;
		return text;
	}
	
}
