package de.klusoft.entwurfsmuster;


public class Singleton {

    // deklariere eine statische Eigenschaft für das Exemplar der Klasse
    private static Singleton instance = new Singleton();	// threadsafe, sicher auch bei paralleler Programmierung
    
    // eine statische Methode, die das Exemplar der Klasse ausliefert
    public static Singleton getInstance() {
	
	return instance;	// bitte OHNE this, weil keine Objekteigenshaft ist
    }
    
    //die Sichtbarkeit des Konstruktors wird eingeschränkt
    private Singleton() {
	
    }
    
    // das Kopieren des Exemplars der Klasse wird verhindert
    @Override
    protected Object clone() {
	
	return instance;
    }
}
