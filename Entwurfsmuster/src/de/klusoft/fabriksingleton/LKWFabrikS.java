package de.klusoft.fabriksingleton;


public class LKWFabrikS extends FabrikS {

    private static LKWFabrikS instance = new LKWFabrikS();
    
    private LKWFabrikS() {

    }

    @Override
    protected ProduktS herstellen() {

	return instance;
	}
    
    public static LKWFabrikS getInstance() {
	return instance;
    }
    
 // das Kopieren des Exemplars der Klasse wird verhindert
    @Override
    protected Object clone() {
	
	return instance;
    }

}
