package de.klusoft.adapter;


public class Automobile {

    protected Boolean ignite = false;
    
    protected Boolean keyPluggedIn = false;
    
    protected Integer kmStand = 0;
    
    // Konstanten der Klasse
    protected static final Integer RI_VOR = 1;
    
    protected static final Integer RI_RUECK = 2;
    
 // Zündschlüssel einstecken
    public void pluginKey() {
	this.keyPluggedIn = true;
    }
    
    // Motor starten, zünden
    public void ignite() {
	this.ignite = true;
    }
    
    // fahren
    public void drive(Integer richtung, Integer kmStand) {
	if(this.ignite) {
	    if(richtung == this.RI_VOR) {
		this.kmStand += kmStand;
	    } else {
		this.kmStand -= kmStand;
	    }
	}
    }
    
    // Zündung ausschalten
    public void stopIgnation() {
	if(this.ignite) {
	    this.ignite = false;
	}
    }
    
    // Zündschlüssel entfernen
    public void removeKey() {
	if(this.ignite == true) {
	    this.ignite = false;
	}
	
	this.keyPluggedIn = false;
    }
        
    public Integer getKmStand() {
	return this.kmStand;
    }
}
