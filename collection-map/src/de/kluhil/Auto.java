package de.kluhil;


public class Auto {

    // eindeutige Nummer des Autos
    private int id = 0;

    // Konstruktor
    Auto(int n){

	this.id = n;
    }

    // eine Methode, welche die Id liefert
    public int getId() {
	return this.id;
    }

    // eine einfache Ausgabe unseres Autos (Klasenname + Id)
    public String toString() {

	return this.getClass().getSimpleName() + " " + this.id;
    }

    // wir überschreiben die Methode equals() der Klasse Object
    // und hoffen, dass Java anschließend entscheiden kann, ob 2 Autos gleich sind
    @Override
    public boolean equals(Object o) {

	// bei einem Vergleich mit "null" muss FALSE rauskommen
	if(o == null) {
	    return false;
	}

	// bei einem Vergleich mit sich selbst muss TRUE rauskommen
	if(o == this) {
	    return true;
	}

	// wir müssen die Vergleichbarkeit der Objekte sicherstellen
	if(this.getClass() != o.getClass()) {
	    return false;
	}

	// vergleiche die eigene Id mit der Id des übergebenen Objektes o
	return this.id == ((Auto) o).id;
    }

    // wir überschreiben die Methode hashCode() der Klasse Object
    // und hoffen, dass Java (speziell HashSet) entscheiden kann, ob 2 Autos gleich sind
    @Override
    public int hashCode() {

	return this.id;
    }
}
