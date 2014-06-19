package de.kluhil;

// Import der Collection-Klassen
import java.util.ArrayList;
import java.util.HashSet;

/**
 * akademische Proben und Übungen zum Collection Framework
 * 
 * @author benutzer
 *
 */
public class CollectionsMain {

    public static void main( String[] args ) {

	// wir definieren ein neues (leeres) HashSet
	// für Zeichenketten
	/*HashSet<String> stringSet = new HashSet<>();

	// wir fügen dem HashSet einige werte hinzu
	stringSet.add( "Hallo" );
	stringSet.add( "Welt!" );
	stringSet.add( "Java" );
	stringSet.add( "Collections" );*/

	// ...

	/* ************************************************************************************** */
	/*
	 * Nachdem wir mit Java-built-in-Klassen das HashSet getestet haben,
	 * probieren wir es mit einer eigenen Klasse Auto
	 */
	/*HashSet<Auto> autoSet = new HashSet<>();

	autoSet.add( new Auto(1) );
	autoSet.add( new Auto(2) );
	autoSet.add( new Auto(3) );
	autoSet.add( new Auto(4) );

	System.out.println( "*** HashSet ausgeben ***" );

	// wir geben das HashSet aus
	for(Auto a : autoSet) {
	    System.out.println( a );
	}

	System.out.println( "*** equals() testen (Autos vergleichen) ***" );

	// wir testen equals()
	Auto a1 = new Auto(10);
	Auto a2 = new Auto(10);
	if(a1.equals( a2 )) {

	    System.out.println( a1 + " gleich " + a2 );
	}

	// wir versuchen, ein Duplikat hinzuzufügen
	if(!autoSet.add( new Auto(1) )) {
	    System.out.println( "Duplikate sind nicht erlaubt!" );
	}

	System.out.println( "*** HashSet ausgeben ***" );

	// wir geben das HashSet noch einmal aus
	for(Auto a : autoSet) {
	    System.out.println( a );
	}*/

	/* ************************************************************************************** */

	/*
	 * ArrayList
	 * - darf Duplikate enthalten
	 * - arbeitet i.d.R. nach dem Prinzip FIFO (first in first out)
	 */

	/*System.out.println( "************ ArrayList ************" );
	System.out.println( " " );

	ArrayList<String> stringListe = new ArrayList<>();

	stringListe.add( "Eins" );
	stringListe.add( "Zwei" );
	stringListe.add( "Drei" );
	stringListe.add( "Vier" );
	stringListe.add( "Fünf" );

	// hier drängelt sich jemand vor
	stringListe.add( 2, "Sechs" );

	for(String s : stringListe) {

	    System.out.println( s );
	}

	System.out.println( "*** Indizies ausgeben ***" );
	System.out.println( " " );

	System.out.println( "Der Index von Eins lautet: " + stringListe.indexOf( "Eins" ));
	System.out.println( "Der Index von Fünf lautet: " + stringListe.indexOf( "Fünf" ));

	System.out.println( " " );

	// wir checken die Größe der ArrayListe
	System.out.println( "*** Größe der ArrayList ***" );
	System.out.println( " " );
	System.out.println( "Die Liste hat " + stringListe.size() + " Elemente" );
	System.out.println( " " );

	// ... und überziehen mal absichtlich das Limit
	stringListe.add( 6, "eingeschoben/angehängt" );

	System.out.println( " " );
	System.out.println( "*** Indizies ausgeben ***" );
	System.out.println( " " );

	// Duplikate einfügen
	stringListe.add( "Eins" );
	stringListe.add( "Zwei" );

	for(String s : stringListe) {

	    System.out.println( s );
	}

	// noch einmal den Index ausgeben
	System.out.println( "*** Indizies ausgeben ***" );
	System.out.println( " " );

	System.out.println( "Der Index von Eins lautet: " + stringListe.indexOf( "Eins" ));

	// das Objekt "Zwei" entfernen
	stringListe.remove( "Zwei" );

	// noch einmal den Index ausgeben
	System.out.println( " " );
	System.out.println( "*** Eintrag 'Zwei' löschen und danach ArrayList neu ausgeben ***" );
	System.out.println( " " );

	for(String s : stringListe) {

	    System.out.println( s );
	}*/

	/* ************************************************************************************** */
	// jetzt Autos
	System.out.println( " " );
	System.out.println( "*** nun Autos: ***" );
	System.out.println( " " );

	ArrayList<Auto> autoListe = new ArrayList<>();

	autoListe.add( new Auto(1) );
	autoListe.add( new Auto(2) );
	autoListe.add( new Auto(3) );
	autoListe.add( new Auto(4) );
	autoListe.add( new Auto(5) );
	autoListe.add( new Auto(6) );

	System.out.println( "*** nun Autos:Hauptliste ***" );

	for(Auto a : autoListe) {

	    System.out.println( a );
	}


	ArrayList<Auto> autoSubListe = new ArrayList<>();

	autoSubListe.add( new Auto(11) );
	autoSubListe.add( new Auto(12) );
	autoSubListe.add( new Auto(13) );
	autoSubListe.add( new Auto(14) );
	autoSubListe.add( new Auto(15) );

	// fügt in einem "Rutsch" alle Einträge der Subliste in die Hauptliste ein
	autoListe.addAll( autoSubListe );

	System.out.println( " " );
	System.out.println( "*** nun Autos:Subliste ***" );
	System.out.println( " " );

	for(Auto a : autoSubListe) {

	    System.out.println( a );
	}

	// Ausgabe der Hauptliste (einschließlich der Subliste)
	System.out.println( " " );
	System.out.println( "*** nun Autos:Hauptliste mit Autos aus der Subliste ***" );
	System.out.println( " " );

	for(Auto a : autoListe) {

	    System.out.println( a );
	}

	// löscht in einem "Rutsch" alle Einträge der Subliste aus der Hauptliste
	autoListe.removeAll( autoSubListe );

	System.out.println( " " );
	System.out.println( "*** nun Autos:Subliste entfernen ***" );
	System.out.println( " " );

	for(Auto a : autoSubListe) {

	    System.out.println( a );
	}



	System.out.println( " " );
	System.out.println( "*** nun Autos: nach Subliste entfernen ***" );
	System.out.println( " " );

	for(Auto a : autoListe) {

	    System.out.println( a );
	}
    }
}
