package de.klusoft.dekorierer;

/**
 * Vorlage für konkrete Dekorierer
 * @author benutzer
 *
 */
public abstract class SalamiPizzaRezept implements Pizza {

    // Klasseneigenschaften
    // Reference auf Pizza
    protected Pizza pizza = null;
    
    // Konstruktor
    public SalamiPizzaRezept(Pizza p) {
	
	this.pizza = p;
    }
    
    // Implementierung erst in den konkreten Dekorierern
    public abstract Float getPreis();

    // Implementierung erst in den konkreten Dekorierern
    public abstract Float getExtras(Integer groesse);
}
