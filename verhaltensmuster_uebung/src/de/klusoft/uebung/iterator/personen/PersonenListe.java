package de.klusoft.uebung.iterator.personen;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import com.Ostermiller.util.CSVParser;


public class PersonenListe implements Iterable< Personen > {

    // Klasseneigenschaften
    protected Personen [] personen = null;
    protected  String csvDatei;
    protected final static String ABSOLUT_PFAD = "/src/de/klusoft/uebung/iterator/personen/";

    // Konstruktor
    public PersonenListe(String liste){

	this.csvDatei = liste;
	
	// einzulesende CSV-Datei finden
	// Pfadangaben
	// 1. Aktuelles Arbeitsverzeichnis
	Path aktArbVerz = Paths.get( "" );

	// 2. absoluten Pfad zur Datei erstellen
	String pfadDatei = aktArbVerz.toAbsolutePath().toString() + ABSOLUT_PFAD + csvDatei; 

	// CSV-Datei öffnen
	try {

	    // Eingabestrom öffnen
	    FileInputStream fis = new FileInputStream(pfadDatei);

	    // Erzeugung eines csv-Parsers, der über den FileInputStream aus der geöffneten Datei liest
	    CSVParser csvp = new CSVParser(fis);

	    // Datensätze aus der CSV-Datei holen
	    String[][] daten = csvp.getAllValues();

	    // Dimensionierung des Arrays this.personen
	    // daten.length --> Anzahl der Objekte (Personen) in der CSV
	    this.personen = new Personen[daten.length];

	    // zeilenweises Auslesen der DAtensätze aus der CSV-Datei
	    for(int i = 0; i < daten.length; i++) {

		// für jeden Eintrag in der CSV-Datei ein Objekt erzeugen und im Array speichern
		this.personen[i] = new Personen(daten[i][0], daten[i][1], daten[i][2]);
	    }
	} catch(IOException e) {

	    System.out.println( "Konnte die Datei: " + pfadDatei + " nicht öffnen!" );
	}

    }

    /* *********    zu implementierende Methoden des Interfaces Iterable ******** */
    @Override
    public Iterator< Personen > iterator() {

	return new PersonenIterator();
    }

    private class PersonenIterator implements Iterator<Personen>{

	// KlassenEigenschaften der Sub-Klasse PersonenIterator
	protected int zeiger = 0;

	@Override
	public boolean hasNext() {

	    // prüfen, ob weitere Elemente in der Datensammlung vorhanden sind 
	    return this.zeiger != PersonenListe.this.personen.length;
	}

	@Override
	public Personen next() {

	    // aktuelles Element (Person) ermitteln
	    Personen retPerson = PersonenListe.this.personen[this.zeiger];

	    // Zeiger um eine Position weiterschieben
	    this.zeiger++;

	    // das aktuelle Element (Person) ausliefern
	    return retPerson;
	}

	@Override
	public void remove() {
	    // bleibt leer

	}

    }

}
