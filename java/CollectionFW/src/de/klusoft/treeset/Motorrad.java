package de.klusoft.treeset;


public class Motorrad extends MotorFahrzeug{
    private String kategorie = "Zweiradfahrzeug";

    // Konstruktor
    Motorrad(int i, int l, int h){

	this.id = i;
	this.leistung = l;
	this.hubraum = h;
    }

    @Override
    public String toString() {

	return this.kategorie + " " + super.toString(); 
    }
}
