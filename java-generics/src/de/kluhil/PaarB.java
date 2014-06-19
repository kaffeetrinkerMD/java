package de.kluhil;


public class PaarB< K, V > implements MyPair< K, V > {

    /**
     * Wir nutzen in dieser Klasse die Möglichkeit, die Typparamaeter des Interfaces
     * durch die Typparameter der Klasse zu spezifizieren:
     * 
     * @param <K> Typparameter für den Schlüssel
     * @param <V> Typparameter für den Wert
     * 
     * @author benutzer
     *
     */

    private K key = null;
    private V value = null;

    // Konstruktor
    public PaarB( K k, V v ) {

	this.key = k;
	this.value = v;
    }

    @Override
    public K getKey() {

	return this.key;
    }

    @Override
    public V getValue() {

	return this.value;
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName() + "(" + this.key + ", " + this.value + ")";
    }

}
