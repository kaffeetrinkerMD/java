package de.klusoft.abstraktefabrik;


public class HTMLTable extends Table {

    @Override
    public void display() {

	// Beginn der HTML-Tabelle
	System.out.println( "<table>" );
	
	// Darstellung des Headers
	this.header.display();
	
	// Darstellung der DatenZeilen
	for(Row r : this.rows) {
	    
	    // jede Zeile möge sich selber zeichnen
	    r.display();
	}
	// Ende der HTML-Tabelle
	System.out.println( "</table>" );
    }

}
