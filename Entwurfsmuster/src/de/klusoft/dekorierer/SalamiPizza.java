package de.klusoft.dekorierer;

/**
 * konkreter Dekorierer
 * @author benutzer
 *
 */
public class SalamiPizza implements Pizza {

    // Klasseneigenschaften
    protected Float preis;
    protected Float extra;

    // Konstruktor
    public SalamiPizza() {

	this.preis = 3.50f;
	this.extra = 0.0f;
    }

    @Override
    public Float getPreis() {

	return this.preis;
    }

    @Override
    public Float getExtras(Integer groesse) {

	return this.extra;
    }

}
