package de.klusoft.adapter;


public class AdapterMain {

    public static void main( String[] args ) {

	// ein Automobile, welches adaptiert werden soll
	Automobile auto = new Automobile();
	
	// ein Adapter
	AutoAdapter adapter = new AutoAdapter(auto);
	
	// Interaktion nur über den Adapter
	adapter.startEngine();
	
	System.out.println( auto.getClass().getSimpleName() );
	System.out.println( "km-Stand: " + auto.getKmStand() );
	System.out.println( "Motor an/ aus: " + auto.ignite );
	System.out.println( "Schlüssel drin: " + auto.keyPluggedIn );
	
	adapter.moveForward(250);
	
	adapter.stopEngine();
	
	System.out.println( "+++ Auto steht wieder +++");
	System.out.println( auto.getClass().getSimpleName() );
	System.out.println( "km-Stand: " + auto.getKmStand() );
	System.out.println( "Motor an/ aus: " + auto.ignite );
	System.out.println( "Schlüssel drin: " + auto.keyPluggedIn );
    }

}
