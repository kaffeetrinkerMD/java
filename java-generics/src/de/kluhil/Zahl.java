package de.kluhil;

/**
 * In einigen Fällen ist es sinnvoll, die konkreten Typen für die vereinbarten Typparameter sinnvoll
 * einzuschränken, so dass nicht mehr alle denbaren Typen verwendet werden dürfen,
 * sondern nur noch diejenigen, die bestimmtn Anforderungen genügen.
 * 
 * bounded type parameters = eingeschränkte Typparameter
 * 
 * Die einschränkung erfolgt unter Ausnutzung der Vererbungshierarchien.
 * 
 * extends, super
 * 
 * @author benutzer
 *
 */

public class Zahl<T extends Integer> {	// hier erfolgt die Einschränkung "T muss Integer erweitern"

    private T zahl = null;
    
    // Konstruktor
    public Zahl(T wert) {
	
	this.zahl = wert;
    }
    
    public boolean istGerade() {
	
	return this.zahl.intValue() % 2 == 0; 
    }
}
