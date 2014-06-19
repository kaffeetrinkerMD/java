package de.klusoft.entwurfsmuster;


public class DesignPatternsMain {

    public static void main( String[] args ) {

	// ausschließlich via Singleton.getInstance()
	// gelange ich an die Referenz
	//des einzigen Exemplares der Klasse
	Singleton s = Singleton.getInstance();
	
	
	System.out.println( s );
	
	// noch ein Exemplar?
	Singleton s1 = Singleton.getInstance();
	
	System.out.println( s1 );
	
	// Kopieren?
	Singleton s2 = (Singleton)s.clone();
	
	System.out.println( s2 );
    }

}
