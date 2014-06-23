package de.klusoft.abstraktefabrik;


public class TextCell extends Cell {
 
    // Konstruktor
    public TextCell(String s) {
	
	super(s);
    }
    
    
    @Override
    public void display() {

	// Beginn der Zelle
	//System.out.print( "|" );
	
	// Inhalt der Zelle
	System.out.printf("|%5s", this.content );
	
	// Ende der Zelle
	System.out.print( "" );
    }
}
