package de.kluhil;

/**
 * in der Klasse Tool ist eine statische Methode definiert, welche ein Wertepaar
 * auf Gleichheit prüft.
 * 
 * Dazu werden die Schlüsselwerte und die Werte jeweils miteinander verglichen
 * 
 * key1 == key2 && value1 == value2 ==> dann soll Gleichheit bestehen
 * 
 * @author benutzer
 *
 */

public class Tool {
    
    // wir müssen die Mthode selber mit Typparametern ausstatten, damit diese 
    // an die Parameter der Methode weitergereicht  werden können
    // die Typparamter der Methode stehen unmittelbar vor dem Rückgabewert
    public static<K,V> boolean vergleiche(PaarB<K,V> p1, PaarB<K,V> p2) {
	
	// Hinweis: Objekte sind nur dann gleich, wenn sie beide die gleiche O-Variable referenzieren
	
	return p1.getKey().equals( p2.getKey() ) && p1.getValue().equals( p2.getValue() );
    }
}
