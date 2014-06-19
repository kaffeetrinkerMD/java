package de.klusoft.fabrikmuster;

public abstract class Fabrik {

	// Name der Fabrik
	protected String name="";
	
	// Konstruktor
	public Fabrik(String n){
		this.name=n;
	}
	
	//�ffentliche Methode, die aus der Anwendung heraus aufgerufen wird,
	// um eine Objekt (Produkt) erzeuegen zu lassen
	public Produkt erzeuge(){
		
		// aus der Anwendung heraus w�rde erzeuge() aufgerufen,
		// das wiedrum die abstrakte Methode herstellen() aufruft
		return this.herstellen();
	}
	
	// �ffentliche abstrakte Methode f�r die eigentliche Produkterzeugung
	abstract protected Produkt herstellen();
}
