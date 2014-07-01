package de.klusoft.verhaltensmuster.iterator;


public class IteratorMain {

    public static void main( String[] args ) {

	// Erzeugung einer autoliste aus der CSV-Datei
	CarList liste = new CarList("autos.csv");
	
	while(liste.valid()) {
	    
	    // aktuelles (Auto)Objekt aus der Liste holen
	    System.out.println( liste.current() );
	    
	    // nächstes Objekt
	    liste.next();
	    
	    
	}
    }

}
