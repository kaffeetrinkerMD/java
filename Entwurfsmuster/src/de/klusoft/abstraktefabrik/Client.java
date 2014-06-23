package de.klusoft.abstraktefabrik;


public class Client {

    // der Client verwaltet die Assoziation (unidirektional)
    // zu einer (abstrakten) TabellenFabrik
    private AbstractFactory tableFactory = null;

    /**
     * der Konstruktor
     * @param fab
     */
    public Client(AbstractFactory fab) {

	// die konkrete Fabrik wird via dependency injection
	// erst zur Laufzeit festgelegt
	this.tableFactory = fab;
    }

    public void showData(String [][] data) throws Exception{

	if(this.tableFactory == null) {
	    throw new Exception("Erst eine neue Fabrik injizieren!");
	}

	// eine Tabelle erzeugen lassen
	Table table = this.tableFactory.createTable();

	// eine Kopfzeile erzeugen lassen
	Header header = this.tableFactory.createHeader();

	String[] headline = data[0];

	for (int i = 0; i < headline.length; i++) {

	    // eine Zelle erzeugen lassen
	    Cell cell = this.tableFactory.createCell( headline[i] );

	    // neue Zelle wird zur Kopfzeile hinzugefügt
	    header.addCell( cell );
	}

	// die fertige Kopfzeile wird in die Tabelle eingetragen
	table.setHeader( header );

	// nun noch die Datenzeilen zur Tabelle hinzufügen
	for(int i=1; i<data.length; i++) {

	    // die Zeile in einem String-Array speichern
	    String [] values = data[i];

	    // neue Zeile in der Tabelle wird benötigt
	    Row row = this.tableFactory.createRow();

	    // für jeden einzelnen Wert aus values erzeuegn wir eine neue Zelle
	    for(String s : values) {

		Cell c = this.tableFactory.createCell( s );

		// und fügen sie zur Zeile hinzu
		row.addCell( c );

	    }

	    // die fertige Datenzeile zur Tabelle hinzufügen
	    table.addRow( row );
	}
	
	// wenn Tabelle erstellt wurde, dann zeichnen
	table.display();
    }
}
