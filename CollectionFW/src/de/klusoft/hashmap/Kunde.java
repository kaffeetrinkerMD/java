package de.klusoft.hashmap;

import java.util.HashMap;

/**
 * Klasse <b>Kunde</b> verwaltet die Klasse <b>Auftrag</b><br>
 * in einer 1:n Multiplizität<br><br>
 * 
 * Die Verwaltung erfolgt mittels <b>HashMap</b><br>
 * @author kluhil<br>
 *
 * TODO alle Aufträge abholen
 */

public class Kunde {

	// HashMap-Objekt zur Verwaltung von Auftrag erzeugen
	HashMap<Integer,Auftrag> auftraege = new HashMap<>();

	// Konstruktor
	Kunde(){}

	/**
	 * registriert einen Auftrag in der HashMap 'auftraege'<br>
	 * @param a <b>Auftrag</b> ist der zu registrierende Auftrag<br>
	 */
	public void registriereAuftrag(Auftrag a){

		this.auftraege.put(a.getAufragNr(), a);
	}

	/**
	 * entfernt einen Auftrag aus der HashMap 'auftraege'<br>
	 * @param a <b>Auftrag</b> ist der zu entfernende Auftrag<br>
	 */
	public void entferneEinenAuftrag(Auftrag a) {

		this.auftraege.remove(a.getAufragNr());
	}

	/**
	 * entfernt alle Aufträge aus der HashMap 'auftraege'<br>
	 */
	public void entferneAlleAuftraege() {

		this.auftraege.clear();
	}

	/**
	 * gibt einen Eintrag aus der HashMap 'auftraege' zurück<br>
	 * @param aufNr <b>int</b> Auftragsnummer
	 * @return <b>Auftrag</b> in der HashMap registrierter Auftrag 
	 */
	public Auftrag holeEinenAuftrag( int aufNr ){

		Auftrag o = null;
		
		if(this.auftraege.containsKey(aufNr)) {
			o = this.auftraege.get(aufNr);	
		}
		return o;
	}

	/**
	 * Gibt alle in der HashMap 'auftraege' registrierten Objekte (Aufträge) zurück<br>
	 * @return s <b>String</b> String-Objekt mit allen in der HashMap 'auftraege' registrierten Objekten (Aufträgen)
	 * @author Dozent S.Bauer  
	 */
	@Override
	public String toString( ){

		String s = "";

		if(!this.auftraege.isEmpty()){

			s = this.getClass().getSimpleName() + " hat folgende Aufträge:\n";

			for (Integer key : this.auftraege.keySet()) {

				s += this.auftraege.get(key) + "\n";
			}	
		} else {
			s = "Keine Aufträge registriert!";
		}
		return s;
	}
}
