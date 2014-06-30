package de.klusoft.verhaltensmuster.iterator;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.Ostermiller.util.CSVParser;


public class CarList implements Iterierbar{

    protected Car[] cars = null;

    protected int position = 0;

    public CarList(String filename) {

	// Öffnen der CSV-Datei (u.U. wird eine IO-Exception geworfen)

	// (1) Pfadangabe bestimmen
	Path cwd = Paths.get( "" ); // das aktuelle Arbeitsverzeichnis bestimmen

	
	// (2) Dateinamen erstllen/zusammenführen
	String file = cwd.toAbsolutePath().toString() + "de/klusoft/verhaltensmuster/iterator" + filename;

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
	    System.out.println( "Konnte die Datei: " + filename + " nicht öffnen!" );
	}

    }

    // Methode des Interfaces Iterierbar
    @Override
    public Car current() {

	// ... liefert das aktuelle Auto (Objekt)
	return this.cars[this.position];
    }

    // Methode des Interfaces Iterierbar
    @Override
    public int key() {

	// ... liefert die aktuelle "Zeiger"Position
	return this.position;
    }

    // Methode des Interfaces Iterierbar
    @Override
    public void next() {

	// ... setzt den Zeiger eine Position weiter
	this.position++;
    }

    // Methode des Interfaces Iterierbar
    @Override
    public void rewind() {

	// .. spult zurück
	this.position = 0;
    }

    // Methode des Interfaces Iterierbar
    @Override
    public boolean valid() {

	return this.position < this.cars.length;
    }
}
