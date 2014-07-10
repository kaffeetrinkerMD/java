package de.klusoft.uebung.join;


public class AktenordnerZaehlenMain {

    public static void main( String[] args ) {
	
	// Anzahl der Kellerräume
	int r = 5;
	
	// Anzahl der Aktenordner je Raum
	int a = 22;
	
	Chef chef = new Chef(r, a);
	
	chef.run();
    }

}
