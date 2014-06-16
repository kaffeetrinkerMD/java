package de.klusoft.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Treeset, "Baummenge", ist eine sortierte Collektion,<br>
 * d.h. die Objekte (deren Eigenschaften) lassen einen Rückschluss<br>
 * auf eine Reihenfolge zu 
 * @author kluhil
 *
 */

public class TreesetMain {

    public static void main( String[] args ) {

	TreeSet<Integer> integerTS = new TreeSet<>();

	// wir fügen einige Werte dem TreeSet hinzu
	integerTS.add( 1 );
	integerTS.add( 100 );
	integerTS.add( -5 );
	integerTS.add( 4 );
	integerTS.add( 20 );
	integerTS.add( 15 );
	integerTS.add( -30 );
	integerTS.add( 0 );
	integerTS.add( 50 );

	// Ausgabe der Elemente
	System.out.println( "---- Integer - TreeSet ----" );
	for(Integer i: integerTS) {

	    System.out.println( i );
	}

	// mit Zeichenketten
	TreeSet<String> stringTS = new TreeSet<>();

	// Werte hinzufügen
	stringTS.add( "Hallo" );
	stringTS.add( "ein" );
	stringTS.add( "ist" );
	stringTS.add( "Das" );
	stringTS.add( "Welt!" );
	stringTS.add( "String-TreeSet." );

	// Ausgabe der Elemente
	// Sortierung ist lexikographisher Ordnung (Großbuchstaben... Kleinbuchstaben)
	System.out.println( "---- String - TreeSet ----" );
	for(String s: stringTS) {

	    System.out.println( s );
	}

	// Ausgabe mit Iterator asc (aufsteigend) <Integer>
	Iterator<Integer> itAscending = integerTS.iterator();

	// ... solange der Iterator noch ein nächstes Element hat
	System.out.println( "---- Integer Iterator Ascending (aufsteigend) ----" );
	while(itAscending.hasNext()) {

	    // ... wird dieses abgerufen
	    Integer i = itAscending.next();

	    System.out.println( i );
	}

	// Ausgabe mit Iterator desc (absteigend) <Integer>
	Iterator<Integer> itDescending = integerTS.descendingIterator();

	// ... solange der Iterator noch ein nächstes Element hat
	System.out.println( "---- Integer Iterator Descending (absteigend) ----" );
	while(itDescending.hasNext()) {

	    // ... wird dieses abgerufen
	    Integer i = itDescending.next();

	    System.out.println( i );
	}

	// Ausgabe mit Iterator asc (aufsteigend) <String>
	Iterator<String> itStrgAscending = stringTS.iterator();

	// ... solange der Iterator noch ein nächstes Element hat
	System.out.println( "---- String Iterator Ascending (aufsteigend) ----" );
	while(itStrgAscending.hasNext()) {

	    // ... wird dieses abgerufen
	    String s = itStrgAscending.next();

	    System.out.println( s );
	}

	// Ausgabe mit Iterator desc (absteigend) <String>
	Iterator<String> itStrgDescending = stringTS.descendingIterator();

	// ... solange der Iterator noch ein nächstes Element hat
	System.out.println( "---- String Iterator Descending (absteigend) ----" );
	while(itStrgDescending.hasNext()) {

	    // ... wird dieses abgerufen
	    String s = itStrgDescending.next();

	    System.out.println( s );
	}

	// Speicherung von Autos in einem TreeSet
	TreeSet<Auto> autoTS = new TreeSet<>();

	Auto aTS1 = new Auto(200);
	Auto aTS2 = new Auto(300);
	Auto aTS3 = new Auto(100);
	Auto aTS4 = new Auto(400);
	Auto aTS5 = new Auto(900);
	Auto aTS6 = new Auto(700);
	Auto aTS7 = new Auto(666);
	Auto aTS8 = new Auto(777);
	Auto aTS9 = new Auto(123);
	Auto aTS10 = new Auto(024);

	autoTS.add( aTS1 );
	autoTS.add( aTS2 );
	autoTS.add( aTS3 );
	autoTS.add( aTS4 );
	autoTS.add( aTS5 );
	autoTS.add( aTS6 );
	autoTS.add( aTS7 );
	autoTS.add( aTS8 );
	autoTS.add( aTS9 );
	autoTS.add( aTS10 );

	// Ausgabe der Autos
	System.out.println( "" );
	System.out.println( "---- AUTOS ----" );
	System.out.println( "" );
	
	for(Auto a: autoTS) {

	    System.out.println( a );
	}

	// Arbeiten mit dem Interface Comparator
	//======================================
	// Vorteil: wir wären flexibel, was die Sortierung innerhalb des TreeSets anbelangt,
	// denn die Reihenfolge im TreeSet richtet sich einzig nach dem Comparator,
	// der dem Konstruktor als Parameter übergeben wird

	// wir erzeugen eine Instanz des gewünschten Comparators
	Comparator<Motorrad> cmpMotorradHubraum= new VergleichHubraum<>();

	// Wir erzeugen ein neues TreeSet mit dem Comparator als Parameter
	TreeSet<Motorrad> motorradTShub = new TreeSet<>(cmpMotorradHubraum);

	Motorrad m1 = new Motorrad(1,23,250);
	Motorrad m2 = new Motorrad(2,120,1200);
	Motorrad m3 = new Motorrad(3,180, 110);
	Motorrad m4 = new Motorrad(4,7 ,50);

	// Motorräder in das TreeSet aufnehmen
	motorradTShub.add(m1);
	motorradTShub.add(m2);
	motorradTShub.add(m3);
	motorradTShub.add(m4);
	
	System.out.println( "" );
	System.out.println( "---- MOTORRÄDER Vergleich:Hubraum----" );
	System.out.println( "" );
	
	for(Motorrad m: motorradTShub) {
	    System.out.println( m );	// hier wird toString() aufgerufen
	}
	
	
	// Vergleich nach Leistung (mit Comparator Leistung)
	Comparator<Motorrad> cmpMotorradLeistung= new VergleichLeistung<>();

	// Wir erzeugen ein neues TreeSet mit dem Comparator als Parameter
	TreeSet<Motorrad> motorradTSlei = new TreeSet<>(cmpMotorradLeistung);
	System.out.println( "" );
	System.out.println( "---- MOTORRÄDER Vergleich:Leistung----" );
	System.out.println( "" );
	
	motorradTSlei.add( m1 );
	motorradTSlei.add( m2 );
	motorradTSlei.add( m3 );
	motorradTSlei.add( m4 );
	
	for(Motorrad m: motorradTSlei) {
	    System.out.println( m );
	}
	
	/* ************************************************************************************** */
	// Vergleiche LKWs
	
	// wir erzeugen eine Instanz des gewünschten Comparators
		Comparator<LKW> cmpLKWHubraum= new VergleichHubraum<>();

		// Wir erzeugen ein neues TreeSet mit dem Comparator als Parameter
		TreeSet<LKW> LKWTShub = new TreeSet<>(cmpLKWHubraum);

		LKW l1 = new LKW(5,300,5000);
		LKW l2 = new LKW(6,400,4000);
		LKW l3 = new LKW(7,500, 3000);
		LKW l4 = new LKW(8,600 ,2000);

		// LKW in das TreeSet aufnehmen
		LKWTShub.add(l1);
		LKWTShub.add(l2);
		LKWTShub.add(l3);
		LKWTShub.add(l4);
		
		System.out.println( "" );
		System.out.println( "---- LKW Vergleich:Hubraum----" );
		System.out.println( "" );
		
		for(LKW k: LKWTShub) {
		    System.out.println( k );	// hier wird toString() aufgerufen
		}
		
		
		// Vergleich nach Leistung (mit Comparator Leistung)
		Comparator<LKW> cmpLKWLeistung= new VergleichLeistung<>();

		// Wir erzeugen ein neues TreeSet mit dem Comparator als Parameter
		TreeSet<LKW> LKWTSlei = new TreeSet<>(cmpLKWLeistung);
		System.out.println( "" );
		System.out.println( "---- LKW Vergleich:Leistung----" );
		System.out.println( "" );
		
		LKWTSlei.add( l1 );
		LKWTSlei.add( l2 );
		LKWTSlei.add( l3 );
		LKWTSlei.add( l4 );
		
		for(LKW w: LKWTSlei) {
		    System.out.println( w );
		}
    }
    

}
