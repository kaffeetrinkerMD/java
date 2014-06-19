package de.kluhil;

/**
 * Die Klasse PaarA implementiert das Interface MyPair<K,V>
 * und spezifiziert noch nicht, welche konkreten Typen K und V sein sollen
 * 
 * Wir nutzen in dieser Klasse die Möglichkeit, die Typparamaeter des Interfaces
 * durch konkrete Typen zu ersetzen:
 * 
 * aus:
 * 
 * 	public class PaarA implements MyPair<K,V>
 * 
 * wird:
 * 
 * 	public class PaarA implements MyPair<String, String>
 * 
 * @author benutzer
 *
 */
public class PaarA implements MyPair<String, String> {

    private String key = null;
    private String value = null;
    
    // Konstruktor
    public PaarA(String k, String v) {
	
	this.key = k;
	this.value = v;
    }
    
    public String getKey() {
	
	return this.key;
    }
    
    public String getValue() {
	
	return this.value;
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName() + "(" + this.key + ", " + this.value + ")";
    }
}
