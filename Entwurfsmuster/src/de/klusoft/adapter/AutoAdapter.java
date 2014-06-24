package de.klusoft.adapter;

/**
 * Klasse verwaltet Automobile (Assoziaktion: unidirektional)
 * @author benutzer
 *
 */
public class AutoAdapter implements Vehicle {

    // Reference auf ein Objekt der Klasse Automobile
    protected Automobile autoMobil = null;
    
    public AutoAdapter(Automobile am) {
	this.autoMobil = am;
    }
    
    @Override
    public void startEngine() {

	// Schlüssel rein (in das Automobil)
	this.autoMobil.pluginKey();
	
	// Motor starten (Zündung ein)
	this.autoMobil.ignite();
    }

    @Override
    public void moveForward(Integer kmStand) {
	
	this.autoMobil.drive( Automobile.RI_VOR, kmStand );
    }

    @Override
    public void stopEngine() {

	// Schlüssel raus
	this.autoMobil.removeKey();
    }

}
