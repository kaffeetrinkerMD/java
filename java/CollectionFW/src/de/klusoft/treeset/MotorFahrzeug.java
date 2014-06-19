package de.klusoft.treeset;

public abstract class MotorFahrzeug{

    // gemeinsame Merkmale für abgeleitete Klassen
    protected int id;
    protected int hubraum;
    protected int leistung;

    // toString() für die abgeleiteten Klassen
    @Override
    public String toString() {

	return this.getClass().getSimpleName()
		+ " ID: " + this.id
		+ " Leistung: " + this.leistung
		+ " Hubraum:" + this.hubraum;
    }
}
