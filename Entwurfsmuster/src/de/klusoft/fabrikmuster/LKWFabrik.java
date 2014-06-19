package de.klusoft.fabrikmuster;

public class LKWFabrik extends Fabrik {

	// Konstruktor (ruft den Konstruktor der Basisklasse auf)
	public LKWFabrik(String n){
		super(n);
	}
	
	@Override
	protected Produkt herstellen() {
		return new LKW();
	}

}
