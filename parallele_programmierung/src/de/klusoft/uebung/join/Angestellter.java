package de.klusoft.uebung.join;


public class Angestellter implements Runnable {

    
    // Anzahl der gezählten Aktenordner
    protected int anzahl = 0;
    
    // Konstruktor
    public Angestellter() {
	
	this.anzahl = 11;
    }
    
    @Override
    public void run() {
	
	this.zaehlen();
	//System.out.println( this.zaehlen() );
    }
    
    public int zaehlen() {
	
	int retVal = 0;
	
	if(this.anzahl > 0) {
	  retVal = this.anzahl;
	  
	}
	return retVal;
    }
    
    @Override
    public String toString() {
	return "";
    }
}
