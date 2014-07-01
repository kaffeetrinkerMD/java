package de.klusoft.uebung.iterator.personen;


public class Personen {

    protected String vorname;
    protected String nachname;
    protected String email;
    
    public Personen(String v, String n, String e) {
	
	this.vorname = v;
	this.nachname = n;
	this.email = e;
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName()
		+ " ( "
		+ this.vorname
		+ ","
		+ this.nachname
		+ ","
		+ this.email
		+ ")";
    }
}
