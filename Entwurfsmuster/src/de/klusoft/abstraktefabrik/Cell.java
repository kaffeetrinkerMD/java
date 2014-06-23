package de.klusoft.abstraktefabrik;


public abstract class Cell {

    // der Inhalt einer Zelle
    protected String content = null;
    
    // der Konstruktor
    public Cell(String c) {
	this.content = c;
    }
    
    // abstrakte Methode, die eine Zelle zeichnet
    public abstract void display();
}
