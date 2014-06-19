package de.klusoft.fabriksingleton;

/**
 * Fabrikmuster
 * 
 * @author klusoft
 *
 */
public abstract class FabrikS {
    
    // Name der Fabrik
    protected String name = "";
    
 // Konstruktor
 	public FabrikS(){
 	}

    public ProduktS erzeuge() {
	
	return this.herstellen();
    }
    
    abstract protected ProduktS herstellen();
}
