package de.klusoft.uebung.join;


public class Chef implements Runnable {

    // Anzahl der Kellerräume
    // pro Kellerraum wird ein angestellter zum Zählen der darin befindlichen Aktenorder benötigt
    protected int anzahlRaeume = 0;
    protected int anzahlOrdner = 0;
    //	Gruppe deklarieren
    protected Angestellter [] gruppe = null;
    
    protected Thread [] th = null;
    
    public Chef(int r, int a) {
	
	this.anzahlRaeume = r;
	this.anzahlOrdner = a;
	
	// Gruppe der Angestellten erzeugen
	this.gruppe = new Angestellter[this.anzahlRaeume];
	
	this.th = new Thread[this.anzahlRaeume];
	
	// alle Angestellten in die Gruppe aufnehmen
	for(int i = 0; i < this.gruppe.length; i++) {
	    
	    this.gruppe[i] = new Angestellter(this.anzahlOrdner);
	    this.th[i] = new Thread(this.gruppe[i]);
	}
    }
    
    // alle Angestellten zählen schicken
    @Override
    public void run() {
    
	for(int i = 0; i < this.th.length; i++) {
	    
	    this.th[i].start();
	}
	
	// Ende der Zählaktion abwarten
	while(nochAktiv()) {
	    
	    try {
		
		for(int i = 0; i < this.th.length; i++) {
		    this.th[i].join();
		}
	    } catch (InterruptedException e) {
		
	    }
	}
	
	// Ergebnisse der Zählung abholen
	int ergebnis = 0;
	
	for(int i = 0; i< this.th.length; i++) {
	    
	    ergebnis += this.gruppe[i].zaehlen();
	}
	
	System.out.println( ergebnis );
    }
    
    // prüfen, ob noch Angestellte beim Zählen sind
    public boolean nochAktiv() {
	
	boolean retVal = false;
	
	for(int i = 0; i < this.th.length; i++) {
	    
	    if(this.th[i].isAlive()) {
		retVal = true;
	    }
	}
	
	return retVal;
    }

}
