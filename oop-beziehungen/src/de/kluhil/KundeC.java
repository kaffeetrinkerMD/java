package de.kluhil;


public class KundeC {

    private final static int MAX_ANZ_AUFTRAEGE = 4;

    // Zaehler für Anzahl der Auträge
    private int auftragsZaehler = 0;

    // Reference auf AuftragC speichern
    private AuftragC [] auftraege = new AuftragC[MAX_ANZ_AUFTRAEGE];

    public void setLink(AuftragC a) throws Exception {

	// prüfen, ob maximale Anzahl von Aufträgen bereits registriert wurde
	if(this.auftragsZaehler >= KundeC.MAX_ANZ_AUFTRAEGE ) {

	    //	Exception werfen
	    throw new Exception("Maximale anzahl möglichher Aufträge bereits erreicht!");
	}

	// prüfen, ob die Auftragsnummer für den Kunden schon registriert ist
	// TODO noch nicht fertig, so nicht!!!
	
	try {
	    this.auftraege[this.auftragsZaehler] = a;    
	} catch(Exception e) {
	    
	    System.out.println( e );
	}
	/*if(this.auftragPruefen( a.getAuftragsNummer() )) {
	    
	    throw new Exception("Dieser Auftrag ist bereits registriert");
	}*/

	
	
	
	// nowendig, damit auch der Auftrag das KundeC-Objekt registriert
	if(this != a.getLink()) {
	    
	    try {
		this.auftraege[this.auftragsZaehler].setLink(this);
		
		this.auftragsZaehler++;
		
		System.out.println("AuftragsZähler: # " + this.auftragsZaehler);
	    } catch(Exception e) {
		System.out.println( "KundeC meckert beim setLink" );
	    }
	}
    }

    public AuftragC getLink() {

	return this.auftraege[this.auftragsZaehler];
    }

    public AuftragC getAllLinks() {

    }

    public void removeLink() {

    }

    public void removeAllLinks() {

    }

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
}
