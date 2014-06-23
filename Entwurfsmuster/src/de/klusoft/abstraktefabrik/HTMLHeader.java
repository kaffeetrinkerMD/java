package de.klusoft.abstraktefabrik;


public class HTMLHeader extends Header {

    @Override
    public void display() {


	// Beginn der Kopfzeile
	System.out.println( "\t<tr style='font-weight: bold'>" );

	// Zellen der Kopfzeilen
	for(Cell cell : this.cells) {

	    // die Zellen mögen sich selber ausgeben
	    cell.display();
	}

	// Beginn der Kopfzeile
	System.out.println( "\t</tr>" );
    }

}
