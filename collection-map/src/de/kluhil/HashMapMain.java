package de.kluhil;

import java.util.HashMap;

/**
 * HashMap<br>
 * Die Einträge werden als Wertepaar gespeichert (Key, Value),<br>
 * wobei der Schlüssel eindeutig innherhalb der Map sein muss<br>
 * Der Zugriff auf die elemente der Map erfolg immer über den Key.<br>
 * Die HashMap ist <b>nicht<b> iterierbar.<br>
 * <br>
 * Die entscheidende Methode zum einfügen ist put();
 * 
 * Link:<br>
 *  http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html<br>
 * 
 * @author benutzer
 *
 */
public class HashMapMain {

    public static void main( String[] args ) {

	HashMap<Integer, String> stringMap = new HashMap<>();

	// Wertepaare in die Map einfügen
	stringMap.put( 1,  "Hallo" );
	stringMap.put( 2,  "Welt" );
	stringMap.put( 3,  "HashMap" );
	stringMap.put( 4,  "Nicht" );
	stringMap.put( 5,  "iterierbar" );

	System.out.println( "====   HashMap    =====" );

	// die Ausgabe aller Elemente der Map über einen Zwischenschritt
	// als for(each) realisieren
	for(Integer key : stringMap.keySet()) { // wir holen uns ein Set der Schlüsselwerte

	    System.out.println( key + " , " + stringMap.get( key ) );	// ... und rufen dann für
	    // jeden einzelnen Schlüsselwert
	    // das assoziierte Objekt
	}

	/*  ************************************************************************************  */
	// wir wollen Autos in der HashMap speichern, brauchen also ein Wertepaar
	// Das Wertepaar soll gebildet werden aus der Id des Autos und dem Auto-Objekt selbst
	//
	// (<Integer>, <Auto>)

	HashMap<Integer, Auto> autoMap = new HashMap<>();

	// wir fügen Wertepaare in die Map ein
	Auto au1 = new Auto(1);
	Auto au2 = new Auto(11);
	Auto au3 = new Auto(20);
	Auto au4 = new Auto(321);

	autoMap.put( au1.getId(), au1 );
	autoMap.put( au2.getId(), au2 );
	autoMap.put( au3.getId(), au3 );
	autoMap.put( au4.getId(), au4 );

	//... und geben alle Autos aus
	System.out.println( "====   autoMap    =====" );

	for(Integer key : autoMap.keySet()) {

	    System.out.println( key + " , " + autoMap.get( key ) );
	}

	// testweise einige HashMap-Methoden ausprobieren
	System.out.println( "Die autoMap ist leer: " + autoMap.isEmpty() );

	System.out.println( "Das Auto mit der Nummer 1 ist in der Map: " + autoMap.containsKey( 1 ) );
	System.out.println( "Das Auto [" + au1 + "] ist in der Map: " + autoMap.containsValue( au1 ) );

	// wir löschen ein Objekt aus der Map (über den Kay wird das Objekt gewählt)
	autoMap.remove( 2 );	// das wäre nicht in der Map
	autoMap.remove( 20 );

	// wir fügen ein neues Auto hinzu, der Schlüssel ist aber bereits in der Map enthalten
	Auto au5 = new Auto(1);
	autoMap.put( au5.getId(), au5 );	// was passiert hier nun? - der vorherige Wert wird überschrieben

	//... und geben alle Autos aus
	System.out.println( "====   autoMap: nach löschen und vorhandenes Auto nochmal    =====" );

	for(Integer key : autoMap.keySet()) {

	    System.out.println( key + " , " + autoMap.get( key ) );
	}
	
	// vorhandene autoMap löschen
	//autoMap = new HashMap<Integer,Auto>();
	autoMap.clear();
	
	//... und geben alle Autos aus
	System.out.println( "====   autoMap: leer  autoMap.clear()  =====" );

	for(Integer key : autoMap.keySet()) {

	    System.out.println( key + " , " + autoMap.get( key ) );
	}
    }

}













