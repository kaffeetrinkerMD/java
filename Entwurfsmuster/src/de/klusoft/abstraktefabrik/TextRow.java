package de.klusoft.abstraktefabrik;


public class TextRow extends Row {

    @Override
    public void display() {

	// alle Datenzellen
	for(Cell cell : this.cells) {

	    // die Zellen sollen sich selber zeichen
	    cell.display();
	}

	// rechte äußere Rahmenbegrenzung
	System.out.println( "|" );
	
	// Untere Ramhmenlinie
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
