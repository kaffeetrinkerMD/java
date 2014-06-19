package de.kluhil;


public class KundeB {

    //	wird für das Speichern der Referenz auf das AuftragB-Objekt genutzt
    private AuftragB auftrag = null;

    // abstrakte Operationen zum Verwalten der Assoziation
    public void setLink(AuftragB a) {
	this.auftrag  = a;

	// nowendig, damit auch der Auftrag das KundeB-Objekt registriert
	if(this != a.getLink()) {
	    this.auftrag.setLink(this);
	}
    }

    public AuftragB getLink() {

	return this.auftrag;
    }

    public void removeLink() {

	// wir speichern den Auftrag temporär, um später dieses Objekt zum Löschen
	// der Assoziation noch zu "kennen"
	AuftragB temp = this.auftrag;

	// prüfen, ob der Auftrag noch mit dem KundeB-Obkjekt verknüpft ist
	if(temp.getLink() == this ) {
	    temp.removeLink();
	}
    }
    
public String toString() {
	
	return this.getClass().getSimpleName() + ": " + this.hashCode();
    }
}
