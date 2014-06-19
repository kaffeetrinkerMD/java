package de.kluhil;

import java.util.HashSet;

public class KundeD {

    // die Aufträge des Kunden werden diesmal in einem HashSet verwaltet
    private HashSet<AuftragD> auftraege = new HashSet<>();

    /**
     * Registriert einen Auftrag beim Kunden. ( ehemals die setLink()-Methode )
     *
     * @param a
     * ein Auftrag, der für den Kunden registriert werden soll
     *
     * @return falls der Auftrag bereits im Kunden registriert ist: false, sonst true
     */
    public boolean auftragHinzufuegen(AuftragD a) {

	return this.auftraege.add(a);
    }

    /**
     * liefert den Auftrag zu einer angegebenen Auftragsnummer
     *
     * @param id eindeutige Auftragsnummer
     *
     * @return falls es den Auftrag mit der Id gibt: den Auftrag, sonst null
     */
    public AuftragD auftragAbfragen(int id) {

	AuftragD retValue = null;

	for (AuftragD a : this.auftraege) {

	    if (a.getId() == id) {

		retValue = a;
		break;
	    }
	}

	return retValue;
    }

    /**
     * löscht den Auftrag zu einer angegebenen Auftragsnummer
     *
     * @param id eindeutige Nummer des Auftrags
     *
     * @return falls der Auftrag gelöscht wurde: true, sonst false
     */
    public boolean auftragLoeschen(int id) {

	boolean retValue = false;

	for (AuftragD a : this.auftraege) {

	    if (a.getId() == id) {
		retValue = this.auftraege.remove(a);
		break;
	    }
	}

	return retValue;
    }

    /**
     * liefert das Kundenobjekt und dessen Aufträge
     *
     * @return Zeichenkette, die für die Ausgabe des Kundenobjekts benutzt werden kann
     */
    public String toString() {

	String s = this.getClass().getSimpleName() + "\n";

	for( AuftragD a: auftraege) {

	    s += a + "\n";
	}

	return s;
    }
}
