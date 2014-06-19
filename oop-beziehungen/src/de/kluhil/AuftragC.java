package de.kluhil;


public class AuftragC {

    private KundeC kunde = new KundeC();

    //	eindeutige Auftragsnummer
    private int auftragsNr = 0;

    //	Konstruktor
    public AuftragC(int nummer) {

	this.auftragsNr = nummer;
    }

    // liefert die Auftragsnummer
    public int getAuftragsNummer() {

	return this.auftragsNr;
    }

    public void setLink(KundeC k ) throws Exception {


	this.kunde = k;

	// nowendig, damit auch der Auftrag das KundeC-Objekt registriert
	if(this != k.getLink()) {
	    
	    try {
		this.kunde.setLink(this);
	    }catch(Exception e) {
		System.out.println( e.getMessage() );
	    }
	} 
    }

    public KundeC getLink() {

	return this.kunde;
    }
    
    public String toString() {
	return this.getClass().getSimpleName() + "# " + this.auftragsNr;
    }
}
