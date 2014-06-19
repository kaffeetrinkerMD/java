package de.kluhil;


public class BeziehungenMain {

    /**
     * die Hauptklasse wird zwischen unseren Klassen die gewünschten Beziehungen herstellen
     * @param args
     */
    public static void main( String[] args ) throws Exception {

	/*Kunde k = new Kunde();
	Auftrag a = new Auftrag();

	// Assoziation herstellen
	k.setLink( a );

	// den Kunden ausgeben
	System.out.println( k );

	// den Auftrag ausgeben, der mit dem Kunden verknüpft ist
	System.out.println( k.getLink() );
	System.out.println( "----------------------" );

	// Assoziation wieder lösen
	k.removeLink();
	 ------------------------------------------------------- 

	// Test der beiden Klassen KundeA und AuftragA
	KundeA kA = new KundeA();

	AuftragA aa1 = new AuftragA(1);
	AuftragA aa2 = new AuftragA(2);
	AuftragA aa3 = new AuftragA(3);
	AuftragA aa4 = new AuftragA(4);

	AuftragA aa5 = new AuftragA(5);

	// Assoziation herstellen
	try {
	    kA.setLink( aa1 );		// es wird möglicherweise eine Exception geworfen, die gefangen werden muss
	    kA.setLink( aa2 );
	    kA.setLink( aa3 );
	    //kA.setLink( aa1 );	// Versuch, einen Auftrag doppelt zu registrieren
	    kA.setLink( aa4 );

	    kA.setLink( aa5 );		// Versuch, einen fünften Auftrag zu registrieren 
	} catch(Exception e) {

	    System.out.println( e.getMessage() );
	}

	// Ausgabe des KundeA - Objektes
	System.out.println( kA );

	// Ausgabe der für den Kunden registrierten Aufträge
	// Array iterieren:
	//	for( Deklaration eines <Temporären Elements>	: <iterierbare Struktur> )
	//	for( AuftragA tmp				: kA.getAllLinks )
	for(AuftragA tmp: kA.getAllLinks()) {

	    if(tmp != null) {
		System.out.println( tmp );
	    }
	}

	System.out.println( "----------------------" );
	System.out.println( "---Test, ob ein einzelner Auftrag abgeholt werden kann ---" );

	AuftragA tmp = kA.getLink( 1 );
	if(tmp != null) {
	    System.out.println( tmp );
	}

	// wir holen Auftrag mit der Nummer 100
	tmp = kA.getLink( 100 );
	if(tmp != null) {
	    System.out.println( tmp );
	}

	System.out.println( "----------------------" );

	// Testen, ob Löschen von Beziehungen klappt
	kA.removeLink( 100 );

	kA.removeLink( 1 );

	kA.removeLink( 5);

	// Test der bidirektionalen Assoziation
	KundeB kb1 = new KundeB();
	AuftragB ab1 = new AuftragB();
	System.out.println( "--- Registrieren  von AuftragB bei KundeB ---" );
	kb1.setLink( ab1 );

	System.out.println( kb1 + " ist assoziaiert mit " + ab1);

	System.out.println( "--- Registrieren  von KundeB bei AuftragB ---" );
	ab1.setLink( kb1 );

	System.out.println( ab1 + " ist assoziaiert mit " + ab1.getLink());

	System.out.println( "----------------------" );

	System.out.println( "---Remove ---" );

	ab1.removeLink();
	System.out.println( kb1 + " ist assoziaiert mit " + ab1);
	System.out.println( ab1 + " ist assoziaiert mit " + kb1.getLink());


	System.out.println( "----------------------" );*/

	// Test von 1:4 Multiplizität
	System.out.println( "--- setLink() ---" );
	KundeC kc1 = new KundeC();
	AuftragC ac1 = new AuftragC(100);
	AuftragC ac2 = new AuftragC(200);
	AuftragC ac3 = new AuftragC(300);
	AuftragC ac4 = new AuftragC(300);

	kc1.setLink(ac1);
	kc1.setLink(ac2);
	kc1.setLink(ac3);
	kc1.setLink(ac4);

	System.out.println( kc1 + " - " + ac1);
	System.out.println( kc1 + " - " + ac2);
	System.out.println( kc1 + " - " + ac3);
	System.out.println( kc1 + " - " + ac4);
	
	// Test der Kompositions-Beziehung
	System.out.println( "--- setLink() ---" );
	
	Auto a = new Auto();
	
	System.out.println( a );
    }
}
