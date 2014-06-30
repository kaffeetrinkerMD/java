package de.klusoft.verhaltensmuster.iterator;


public class Car {

    protected String hersteller;
    protected String farbe;
    protected int kilometerstand;

    public Car(String h, String f, int k) {

	this.hersteller = h;
	this.farbe = f;
	this.kilometerstand = k;

    }

    public String toString() {

	return this.getClass().getSimpleName()
		+ " ("
		+ this.hersteller
		+ ", "
		+ this.farbe
		+ ", "
		+ this.kilometerstand
		+ ")";
    }
}
