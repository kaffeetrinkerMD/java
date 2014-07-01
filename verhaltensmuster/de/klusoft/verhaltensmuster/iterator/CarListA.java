package de.klusoft.verhaltensmuster.iterator;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import com.Ostermiller.util.CSVParser;

/**
 * Klasse CarListA implementiert das Interface Iterable,
 * was bedeutet, die Methode iterator() muss bereitgestellt werden
 * 
 * @author benutzer
 *
 * @param <Car>
 */

public class CarListA implements Iterable<Car> {

    // ein Array für die Autos
    protected Car [] cars = null;

    public CarListA(String filename) {

	// Öffnen der CSV-Datei (u.U. wird eine IO-Exception geworfen)

	// (1) Pfadangabe bestimmen
	Path cwd = Paths.get( ""); // das aktuelle Arbeitsverzeichnis bestimmen

	System.out.println( cwd );

	// (2) Dateinamen erstllen/zusammenführen
	String file = cwd.toAbsolutePath().toString() + "/de/klusoft/verhaltensmuster/iterator/" + filename;

	// (3) Versuch, die Datei zu öffnen
	try {
	    // Eingabestrom öffnen
	    FileInputStream fis = new FileInputStream(file);

	    // Erzeugung eines csv-Parsers, der über den FileInputStream aus der geöffneten Datei liest
	    CSVParser csvp = new CSVParser(fis);

	    // Datensätze aus der CSV-Datei holen
	    String[][] daten = csvp.getAllValues();

	    // Dimensionierung des Arrays this.cars
	    // daten.length --> Anzahl der Objekte (Autos) in der CSV
	    this.cars = new Car[daten.length];

	    // zeilenweises Auslesen der DAtensätze aus der CSV-Datei
	    for(int i = 0; i < daten.length; i++) {

		// für jeden Eintrag in der CSV-Datei ein Objekt erzeugen und im Array speichern
		// der dritte Parameter (siehe Konstruktor Car (... , ..., int ...) muss in ein String-Objekt gewandelt werden --> type-cast
		this.cars[i] = new Car(daten[i][0], daten[i][1], Integer.valueOf(daten[i][2]));
	    }
	} catch(IOException e){
	    System.out.println( "Konnte die Datei: " + file + " nicht öffnen!" );
	}

    }

    
    // der Aufruf von Iterator liefert einen neuen Iterator
    // der Klasse MeinCarListIterator
    /**
     * <p>
     * der Aufruf von Iterator liefert einen neuen Iterator<br>
     * der Klasse MeinCarListIterator
     */
    @Override
    public Iterator< Car > iterator() {

	return new MeinCarListIterator();
    }

    /**
     * Die innere Klasse implementiert das Interface Iterator und muss die drei Methoden:
     * - next()
     * - hasNext()
     * - remove()
     * anbieten.
     * 
     * Die Methoden der inneren Klasse sind von außen nicht zu erreichen --> Zugriffsschutz
     * Die  innere Klasse kann aber auf alle Methoden/Eigenschaften der äußeren Klasse zugreifen
     * 
     * @author benutzer
     *
     */
    private class MeinCarListIterator implements Iterator<Car>{

	// dient dem Iterationsprozess
	// durchläuft alle Werte vom Index 0 ... (Größe des Feldes)
	protected int position = 0;
	
	@Override
	public boolean hasNext() {
	    
	    // prüft, ob es weitere ELemene gibt oder der Positionszeiger am Ende angelangt ist
	    return this.position != CarListA.this.cars.length;
	}

	@Override
	public Car next() {

	    // ermittelt das aktuelle Element
	    Car ret = CarListA.this.cars[this.position];
	    
	    // schiebt den Zeiger eine Position weiter
	    this.position++;
	    
	    // liefert das aktuelle Element aus
	    return ret;
	}

	@Override
	public void remove() {
	    // bleibt leer... (es soll nichts gelöscht werden)
	}

    }
}
