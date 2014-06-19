package de.kluhil;

/**
 * Beziehungen zwischen Klassen: Komposition
 * 
 * Die Klasse Auto ist ein Kompositionsobjekt, welches die benötigten
 * Einzelteilobjekte selber erzeugt.
 * 
 * Damit ist die Lebendauer der Einzelteile von der des Kompositionsobjektes Auto abhängig.
 * 
 * Die Einzelteile können nicht ohne das Kompositionsobjekt
 * existieren -->> strengere Form der Aggregation.
 * 
 * Darstellung hier: 1:1 Multiplizität
 * @author benutzer
 *
 */
public class Auto {

    // Objektvariablen für Einzelteile
    Einzelteil1 e1 = null;
    
    // der Konstruktor erzeugt die Einzelteile
    public Auto() {
	
	this.e1 = new Einzelteil1();
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName() + " hat folgendes Einzeilteil: " + this.e1.hashCode();
    }
}
