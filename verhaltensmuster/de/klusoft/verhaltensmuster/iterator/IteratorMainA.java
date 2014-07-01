package de.klusoft.verhaltensmuster.iterator;

import java.util.Iterator;


public class IteratorMainA {

    public static void main( String[] args ) {

	System.out.println( "----  CarListMainA ----" );

	CarListA listeA = new CarListA("autos.csv");

	for(Car auto : listeA) {
	    System.out.println( auto );
	}

	System.out.println( "---- noch einmal iterieren CarListMainA ----" );

	// das erweiterte for() (foreach()) holt sich einen neuen Iterator und iteriert die selbe Liste
	// noch einmal
	for(Car auto : listeA) {
	    System.out.println( auto );
	}
	
	// mal den Iterator selber testen (ohne for())
	
	Iterator<Car> itCar = listeA.iterator();
	
	System.out.println( "---- Ausgabe itCar: next() bedenkenlos eingesetzt ----" );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	System.out.println( itCar.next() );
	
	// System.out.println( itCar.next() );	// sollte eine Exception provozieren
	
	Iterator<Car> itCarB = listeA.iterator();
	
	
	System.out.println( "---- Ausgabe itCarB: next() richtig eingesetzt ----" );
	while(itCarB.hasNext()) {
	    
	    System.out.println( itCarB.next() );
	}
    }
}
