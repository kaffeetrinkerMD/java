package de.klusoft.uebung.iterator.personen;


public class PersonenMain {

    public static void main( String[] args ) {

	PersonenListe persListe = new PersonenListe("personen.csv");
	
	for(Personen personenLi : persListe) {
	    
	    System.out.println( personenLi );
	}
    }

}
