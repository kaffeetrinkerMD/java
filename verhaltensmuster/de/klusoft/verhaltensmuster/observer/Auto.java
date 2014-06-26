package de.klusoft.verhaltensmuster.observer;

/**
 * Klasse Auto implementiert die beiden Interfaces Vehicle und Stalker
 * Auto ist das opfer (zu beobachtendes Subjekt)
 * @author benutzer
 *
 */
public class Auto implements Opfer, Vehicle {

    // Klasseneigenschaften
    protected Integer kmStand;
    protected Boolean engineStarted;
    
    // Konstruktor
    public Auto( Integer kmStand) {
	
	this.kmStand = kmStand;
    }

    ///////////////////////////////////////////////////////////////////////////////
    /*
     * ab hier die Methoden des Interfaces Vehicle
     * @see de.klusoft.verhaltensmuster.observer.Opfer#attach(de.klusoft.verhaltensmuster.observer.Stalker)
     */
    @Override
    public void startEngine() {
	
	this.engineStarted = true;
    }

    @Override
    public void StopEngine() {

	this.engineStarted = false;
    }

    @Override
    public void moveForward( Integer km ) {

	this.kmStand += km;
	
	// ... wenn sich der kmStand ändert, dann alle Stalker informieren
	this.informiere();
    }

    ///////////////////////////////////////////////////////////////////////////////
    /*
     * ab hier die Methoden dees Interfaces Opfer
     * @see de.klusoft.verhaltensmuster.observer.Opfer#attach(de.klusoft.verhaltensmuster.observer.Stalker)
     */
    
    /**
     * Fügt neue Stalker(Beobachter) zu einer Liste des Opfers hinzu
     * verwendet wird Set hashSet
     */
    @Override
    public void attach( Stalker stalker ) {

    }

    /**
     * Entfernt einen Stalker (Beobachter) aus der Liste des Opfers
     */
    @Override
    public void deatch( Stalker stalker ) {


    }

    @Override
    public void informiere() {

	// für jeden registrierten Stalker die Methode update() aufrufen
    }

    // Interceptor toString für die Ausgabe
    public String toString() {
	
	// TODO Rückgabewert überprüfen
	return System.out.println();
    }
    
    public Integer getKilometerstand() {
	
	return this.kmStand;
    }
}
