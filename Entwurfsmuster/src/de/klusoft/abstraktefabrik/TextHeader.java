package de.klusoft.abstraktefabrik;


public class TextHeader extends Header {

    @Override
    public void display() {

	// Zellen der Kopfzeilen
	for(Cell cell : this.cells) {

	    // die Zellen mögen sich selber ausgeben
	    cell.display();
	}
	
	// rechte äußere Zeilenbegrenzung
	System.out.println( "|" );
	
	// untere Rahmenlinie der Kopfzeile
	//System.out.println( "+-----+-----+-----+-----+-----+" );
	this.rahmenLinie();
	
    }
    
    private void rahmenLinie() {

        System.out.print("+");

        for (int i = this.cells.size() * 6 - 1; i > 0; i--) {

            System.out.print("-");
        }

        System.out.println("+");
    }

}
