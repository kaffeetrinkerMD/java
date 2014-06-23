package de.klusoft.abstraktefabrik;


public class TextTable extends Table{

    @Override
    public void display() {

	// Beginn der Text-Tabelle
	System.out.println( "+-----+-----+-----+-----+-----+" );
	
	// Darstellung des Headers
	this.header.display();
	
	// Darstellung der DatenZeilen
	for(Row r : this.rows) {
	    
	    // jede Zeile möge sich selber zeichnen
	    r.display();
	}
    }
}
