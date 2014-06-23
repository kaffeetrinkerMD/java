package de.klusoft.abstraktefabrik;


public class HTMLCell extends Cell {

    // Konstruktor
    public HTMLCell(String s) {
	
	super(s);
    }
    
    
    @Override
    public void display() {

	// Beginn der Zelle
	System.out.print( "\t\t<td>" );
	
	// Inhalt der Zelle
	System.out.print( this.content );
	
	// Ende der Zelle
	System.out.println( "\t\t</td>" );
    }

}
