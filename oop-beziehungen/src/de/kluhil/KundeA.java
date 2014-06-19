package de.kluhil;

/**
 * die Klasse verwaltet die 1:4 Multiplizität zwischen KundaA und AuftragA
 * 
 * KundeA ---> AuftragA
 * 
 * @author benutzer
 *
 */
public class KundeA {

    //	Konstanten
    private static final int MAX_AUFTRAEGE = 4;

    // referenziert die Aufträge
    private AuftragA [] auftraege = new AuftragA[MAX_AUFTRAEGE];

    // Auftragszähler
    private int auftragsZaehler = 0;

    // liefert TRUE, falls die übergebene Auftragsnummer bereits im Feld auftraege enthalten ist
    protected boolean auftragPruefen(int auftragsNummer) {

	boolean gefunden = false;

	// gesucht wird nur in den bereits eingetragenen Elementen
	// d.h. bei einem leeren Feld suchen wir überhaupt nicht
	for(int i = 0; i < this.auftragsZaehler; i++) {

	    // wenn wir die Auftragsnummer gefunden haben, dann beenden wir die Schleife
	    if(this.auftraege[i].getAuftragsNummer() == auftragsNummer) {
		gefunden = true;
		break;
	    }
	}

	return gefunden;
    }


    // hier wird die Verknüpfung zu einem Auftrag hergestellt
    // dabei wird überprüft, ob die Vorgabe von maximal 4 Aufträgen erfüllt wird
    // Hinweis: in der Signatur muss deklariert werden, dass eine Exception geworfen wird,
    //		sonst muss sich die Exception selber behandeln
    public void setLink(AuftragA a) throws Exception {

	//	Prüfung, ob noch Aufträge für den Kunden registriert werden können
	if(this.auftragsZaehler >= KundeA.MAX_AUFTRAEGE) {

	    throw new Exception("Es sind bereits " + KundeA.MAX_AUFTRAEGE + "für den Kunden registriert!");
	}

	// wir lassen das Auftragsfeld durchsuchen, ob die Auftragsnummer nicht vlt. schon vorhanden ist
	// ansonsten wird eine Exception geworfen
	if(this.auftragPruefen( a.getAuftragsNummer() )) {

	    throw new Exception("Dieser Auftrag ist bereits registriert");
	}

	// nachdem ausführlich geprüft wurde, wird der Auftrag in das Auftragsfeld eingetragen
	this.auftraege[this.auftragsZaehler] = a;

	//	anschließend wird der Auftragszähler erhöht
	this.auftragsZaehler++;
    }

    // liefert alle registrierten Aufträge (Beziehungen) als Feld
    // Hinweis: sollten im Feld Auftragsslots nicht belegt sein, steht dort der NULL-Wert
    public AuftragA [] getAllLinks() {

	return this.auftraege;
    }

    // durchsucht das Auftragsfeld nach einer Auftragsnummer und liefert den Index
    // falls nicht vorhanden wird -1 zurückgegeben
    protected int sucheAuftrag( int auftragsNummer) {

	int i = 0; 

	for( i = 0; i < this.auftragsZaehler; i++) {

	    // kritisch!!!
	    if(this.auftraege[i].getAuftragsNummer() == auftragsNummer) {
		break;
	    }
	}

	if(i >= KundeA.MAX_AUFTRAEGE) {

	    return -1;	// Auftrag wurde nicht gefunden
	} else {

	    return i;	// Auftrag wurde gefunden
	}
    }

    // Auftragsfeld muss nach einem Auftrag mit der Auftragsnummer durchsucht werden
    // geliefert wird der gefundene Auftrag oder NULL
    public AuftragA getLink(int auftragsNummer) {

	// Suche nach dem Auftrag... wird gegebenfalls zurückgeliefert
	int i = this.sucheAuftrag( auftragsNummer );

	// ... wird gegebenfalls zurückgeliefert
	if(i < 0) {

	    return null;
	} else {

	    return this.auftraege[i];
	}

    }

    // löst alle registrierten Beziehungen zwischen KundeA und AuftragA
    public void removeAllLinks() {

	// Idee Rene
	/*this.auftraege = new AuftragA[KundeA.MAX_AUFTRAEGE];*/

	// Idee Hilmar
	for(int i = 0; i<this.auftragsZaehler;i++) {

	    this.auftraege[i] = null;
	}

	this.auftragsZaehler = 0;
    }

    // löst eine einzelne Beziehung zwischen KundeA und AuftragA
    public void removeLink(int auftragsNummer) {

	// Auftrag suchen lassen
	int i = this.sucheAuftrag( auftragsNummer );
	
	// Methode wird verlassen, wenn der Auftrag nicht vorhanden ist
	if(i < 0) {
	    
	    return;
	}

	// das gelöschte Element wird durch das letzte Element des Arrays ersetzt
	// der Zähler steht immer 1 weiter, als das letzte Element
	// E=0 -> Z=1; (E ist der Index für das entsprechende Element)
	this.auftraege[i] = this.auftraege[this.auftragsZaehler-1];
	
	// das letzte Element wird dann gelöscht
	this.auftraege[this.auftragsZaehler-1] = null;
	
	// Platz für neuen Auftrag schaffen
	this.auftragsZaehler--;
    }
    
    // eine einfache Ausgabe des Objektes ermöglichen
    public String toString(){
	return this.getClass().getSimpleName() + " hat folgende Aufträge: ";
    }
}
