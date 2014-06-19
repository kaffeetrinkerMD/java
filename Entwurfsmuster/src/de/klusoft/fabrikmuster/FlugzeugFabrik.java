package de.klusoft.fabrikmuster;

public class FlugzeugFabrik extends Fabrik {

	// Konstruktor (ruft den Konstruktor der Basisklasse auf)
	public FlugzeugFabrik(String n){
		super(n);
	}

	@Override
	protected Produkt herstellen() {
		return new Flugzeug();
	}

}
