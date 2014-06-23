package de.klusoft.abstraktefabrik;


public class HTMLRow extends Row {

    @Override
    public void display() {

	// Beginn der Zeile
	System.out.println( "\t<tr>" );
	
	// alle Datenzellen
	for(Cell cell : this.cells) {
	    
	    // die Zellen sollen sich selber zeichen
	    cell.display();
	}
	
	// Ende der Zeile
	System.out.println( "\t</tr>" );
    }

}
