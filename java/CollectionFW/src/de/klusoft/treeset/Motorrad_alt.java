package de.klusoft.treeset;


public class Motorrad_alt {

    public int leistung;
    public int hubraum;
    public int id;
    
    Motorrad_alt(int i, int l, int h){
	
	this.id = i;
	this.hubraum = h;
	this.leistung = l;
    }
    
    public String toString() {
	
	return this.getClass().getSimpleName()
		+ " ID: " + this.id
		+ " Leistung: " + this.leistung
		+ " Hubraum:" + this.hubraum;
    }
}