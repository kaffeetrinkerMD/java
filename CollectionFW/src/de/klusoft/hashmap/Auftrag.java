package de.klusoft.hashmap;

/**
 * Verwaltung aller Aufträge<br>
 * Auftrag wird von Klasse Kunde verwaltet<br>
 * 
 * @author kluhil
 *
 */
public class Auftrag {

	// eindeutige AuftragsNummer
	private int auftragNr;

	// Konstruktor
	Auftrag( int aufNr){

		this.auftragNr = aufNr;
	}

	// liefert Auftragsnummer
	public Integer getAufragNr(){

		return this.auftragNr;
	}

	@Override
	public int hashCode(){

		return this.getAufragNr();
	}

	@Override
	public boolean equals(Object o) {

		boolean retVal = false;

		if(this.auftragNr == ((Auftrag) o).getAufragNr()) {
			retVal = true;
		}

		return retVal;
	}

	@Override
	public String toString(){

		//return this.getClass().getSimpleName() + " " +  this.auftragNr + " hat den Hash-Wert # " + super.hashCode();
		return this.getClass().getSimpleName() + " " +  this.auftragNr + " hat den Hash-Wert # " + this.hashCode();
	}
}
