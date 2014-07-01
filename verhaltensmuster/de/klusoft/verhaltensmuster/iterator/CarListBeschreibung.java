package de.klusoft.verhaltensmuster.iterator;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import com.Ostermiller.util.CSVParser;

/**
 * IST KEIN ITERATOR!!!!
 * 
 * Die Klasse stellt in erster Linie die Daten bereit, durch die iteriert werden soll.
 * Weiterhin muss sie einen Iterator bereitstellen (anbieten), damit durch die Datensammlung
 * iteriert werden kann.
 * 
 * ABER: diese Klasse kann auch selber als ein Interator programmiert werden
 * 
 * Iteratoren in Java können nicht zurück gespult werden
 * 
 * für jeden Iterationsvorgang wird ein neuer Iterator erzeugt (der immer ganz vorne beginnt)
 * 
 * iterierbare Klassen implementieren auch nicht das Iterator-Interface direkt,
 * sondern das Interface Iterable
 * 
 * das Interface Iterable schreibt nur eine einzige Methode vor: Iterator<T>iterator()
 * 
 * 
 * 
 * @author benutzer
 *
 * @param <E>
 */

/*public class CarListIterator<E > implements Iterator<E> {*/
public class CarListBeschreibung<E > implements Iterable<E> {

    protected Car[] cars = null;

    protected int position = 0;

    public CarListBeschreibung(String filename) {

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

    @Override
    public Iterator< E > iterator() {

	// TODO Automatisch generierter Methodenstub
	return null;
    }
}
