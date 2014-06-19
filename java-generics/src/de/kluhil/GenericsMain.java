package de.kluhil;

/**
 * Quelle zu Generics:
 * 
 * http://www.angelikalanger.com/GenericsFAQ/JavaGenericsFAQ.html
 * http://docs.oracle.com/javase/tutorial/java/generics/index.html
 * http://openbook.galileocomputing.de/javainsel/javainsel_09_001.html#dodtp1e5aa8bf-acb7-4f0f-b3cf-176e06f73845
 * 
 * @author benutzer
 *
 */
public class GenericsMain {

    public static void main( String[] args ) {


	// wir setzen die Box ein

	Box kiste = new Box();

	// etwas in die Box packen (Zeichenkette)
	kiste.set( "Hallo Welt" );

	// in der Box befindet sich nun Objekt der Klasse String
	// das Objekt kann aber nur als ein Objekt der Klasse "Object" verwendet werden

	/*String str = kiste.get();*/ // der Compiler moniert

	// daher explizierten Type-Cast
	String str = (String) kiste.get();	// das ist in Ordnung

	/*Integer i = (Integer) kiste.get();*/	// das ist syntaktisch in Ordnung, aber fragwürdig

	// Ausgabe:
	System.out.println( "Ausgabe des Objektes (als type-cast von Object):" );
	System.out.println( "str: " + str );
	System.out.println( "System.out.println( (String) kiste.get()): " + (String) kiste.get());

	/* ************************************************************************************** */

	// Einsatz der generischen Box

	// Speicherung von Zeichenketten
	BoxGenerisch<String> genKiste = new BoxGenerisch<String>();

	// Speicherung von ganzen Zahlen
	BoxGenerisch<Integer> genIntKiste = new BoxGenerisch<Integer>();

	genKiste.set( "Hallo Welt!" );

	genIntKiste.set( 1234 );

	// Ausgabe:
	System.out.println( "----------------------------------------------------------" );
	System.out.println( "-------------- generische Klassen (Typen) --------------" );

	System.out.println( "genKiste: " + genKiste.get() );
	System.out.println( "genIntKiste: " + genIntKiste.get() );

	/* ************************************************************************************** */

	// wir setzen unser Wertepaar PaarA ein (generisches Interface)

	PaarA pa = new PaarA("Hallo", "Welt");

	// Ausgabe
	System.out.println( "----------------------------------------------------------" );
	System.out.println( "-------------- generisches Interface --------------" );

	System.out.println( "pa --> " + pa );

	/* ************************************************************************************** */

	// wir setzen unser Wertepaar PaarB ein (generisches Interface)
	PaarB<Integer, Integer> pb1 = new PaarB<Integer, Integer>(3, 5);
	PaarB<Integer, String> pb2 = new PaarB<Integer, String>(5, "Hallo");

	// seit Java7 ddarf bei der Verwendung der Generics abgekürzt werden
	// hier wird der s.g. Diamant (diamond) <> eingesetzt
	// dies ist erlaubt, weil der compiler aus der Anweisung auf die konkreten Typen
	// für die Typparameter schließen kann
	PaarB<String, Integer> pb3 = new PaarB<>("Regen", 0);

	// Ausgabe
	System.out.println( "----------------------------------------------------------" );
	System.out.println( "-------------- gener. Klasse mit impl. gener. Interface--------------" );

	System.out.println( "pb1 --> " + pb1 );
	System.out.println( "pb2 --> " + pb2 );
	System.out.println( "pb3 --> " + pb3 );

	/* ************************************************************************************** */
	// RAW-Types dienen der Abwärtskompatibilität, weil in früheren Java-Versionen
	// noch keine generischen Datentypen existierten
	//
	// RAW -> nicht-generisches Verhalten
	// die offizielle Dokumentation rät, die Verwendung von RAW-Typen zu vermeiden

	BoxGenerisch rawKiste = new BoxGenerisch();
	rawKiste.set( "Hallo Welt!" );
	String oopsi = (String)rawKiste.get();

	/* ************************************************************************************** */
	// wir setzen die generische Methode ein
	PaarB<Integer, Integer> pb4 = new PaarB<>(1,1);
	PaarB<Integer, Integer> pb5 = new PaarB<>(1,1);

	System.out.println( "----------------------------------------------------------" );
	System.out.println( "-------------- generische Methode --------------" );

	if(Tool.<Integer, Integer>vergleiche( pb4, pb5 )) {

	    System.out.println( pb4 + " und " + pb5 + " sind gleich!");
	} else {
	    System.out.println( pb4 + " und " + pb5 + " sind ungleich!");
	}

	PaarB<Integer, Integer> pb6 = new PaarB<>(2,1);
	PaarB<Integer, Integer> pb7 = new PaarB<>(1,1);

	if(Tool.<Integer, Integer>vergleiche( pb6, pb7 )) {

	    System.out.println( pb6 + " und " + pb7 + " sind gleich!");
	} else {
	    System.out.println( pb6 + " und " + pb7 + " sind ungleich!");
	}
	
	/* ************************************************************************************** */
	// wir setzen die eingeschränkte, generische Klasse ein
	
	Zahl<Integer> z1 = new Zahl<>(10);
	/*Zahl<String> z2 = new Zahl<>("20");*/	// so nicht; String ist ein anderer Objektdatentyp
	
	// Ausgabe
	
    }

}
