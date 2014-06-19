package de.kluhil;


public class AuftragA {

    //	eindeutige Auftragsnummer
    private int auftragsNummer = 0;

    //	Konstruktor
    public AuftragA(int nummer) {
	
	this.auftragsNummer = nummer;
    }

    // liefert die Auftragsnummer
    public int getAuftragsNummer() {
	
	return this.auftragsNummer;
    }
    
    // gibt den Auftrag samt Nummer als Zeichenkette zurück
    public String toString() {
	
	return this.getClass().getSimpleName() + "# " + this.auftragsNummer;
    }
}
