package de.kluhil.unidirekt.hashmap;

import java.util.HashMap;

public class Kunde {

    // eindeutige Id für den Kunden festlegen
    int kid;
    
    // Verwaltung in einer HashMap
    HashMap<Integer,Auftrag> auftragsMap = new HashMap<>();
    
    Kunde(int id) {
	
	this.kid = id;
    }
    
    // Methode liefert KundenId zurück
    public Integer getKundeId() {
	
	return this.kid;
    }
    
 // eine einfache Ausgabe unseres Kunden (Klassenname + Id)
    public String toString() {

	return this.getClass().getSimpleName() + " " + this.kid;
    }
    
    // Auftrag für den Kunden registrieren
    public void registriereAuftrag( Auftrag a) {
	
	this.auftragsMap.put( this.getKundeId(), a ); (Schlüsselpar: auftragsnummer, Auftrag)
    }
}
