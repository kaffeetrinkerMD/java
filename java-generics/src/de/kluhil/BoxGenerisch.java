package de.kluhil;

/**
 * Eine generische Box, deren Inhalt durch den Typparameter <T> spezifiziert wird
 * 
 * @author benutzer
 *
 * @param <T> gibt an, von welchem Typ der Inhalt ist
 */

public class BoxGenerisch< T > {

    private T content = null;
    
    // wir verwenden den Typparameter für den Parameter der set-Methode
    public void set( T o ) {
	
	this.content = o;
    }
    
    // wir verwenden den Typparameter für den Rückgabewert der get-Methode
    public T get() {
	
	return this.content;
    }
}
