package de.kluhil;


public class AuftragB {

    // wir brauchen eine Referenz auf ein KundeB-Objekt
    private KundeB kunde = null;

    // abstrakte Operationen zum Verwalten der Beziehung 


    public void setLink(KundeB k) {

	this.kunde = k;

	if(k.getLink() != this) {
	    this.kunde.setLink( this );
	}
    }

    public KundeB getLink() {

	return this.kunde;
    }

    public void removeLink() {

	KundeB temp = this.kunde;
	
	// Assoziation lösen
	this.kunde= null;
	
	// prüfen, ob die andere Seite die Assoziation noch lösen muss
	if(temp.getLink() == this) {
	    temp.removeLink();
	}
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName() + ": " + this.hashCode();
    }
}
