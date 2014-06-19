package de.kluhil;


/**
 * die Klasse verwaltet die Assoziation mit fester 1:1 Multiplizität
 * KUNDE ---> AUFTRAG
 * @author benutzer
 *
 */
public class Kunde {

    //	genau 1 Auftragsobjekt kann referenziert werden
    private Auftrag auftrag = null;

    //	Herstellen der Beziehung (Assoziation)
    public void setLink(Auftrag a) {

	this.auftrag = a;
    }

    //	Abfragen der Beziehung (Assoziation)
    public Auftrag getLink() {

	return this.auftrag;
    }

    //	Aufheben (Beenden) der Beziehung (Assoziation)
    public void removeLink() {

	this.auftrag = null;
    }

    //	Ausgabemöglichkeit für Objekte dieser Klasse
    public String toString() {
	return this.getClass().getSimpleName() + " ist mit folgendem Auftrag verknüpft: " + this.auftrag;
    }

}
