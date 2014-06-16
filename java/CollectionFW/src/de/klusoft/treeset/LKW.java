package de.klusoft.treeset;


public class LKW extends MotorFahrzeug{
    
    private String kategorie = "Nutzfahrzeug";
    
    // Konstruktor
    LKW(int i, int l, int h){
	
	this.id = i;
	this.leistung = l;
	this.hubraum = h;
    }
    
    @Override
    public String toString() {
	
	return this.kategorie + " " + super.toString(); 
    }
}
