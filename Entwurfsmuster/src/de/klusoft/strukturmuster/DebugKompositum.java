package de.klusoft.strukturmuster;

import java.util.ArrayList;


public class DebugKompositum extends Debugger {

    private ArrayList<Debugger> debugger = new ArrayList<>();

    @Override
    public void debug( String nachricht ) {

	for(Debugger kind : this.debugger ) {
	    kind.debug( nachricht );
	}
    }

    // Debugger zum Kompositum hinzufügen
    public void addDebugger(Debugger deb) {

	this.debugger.add( deb );
    }

    // Debugger aus dem Kompositum entfernen
    public void removeDebugger(Debugger deb) {

	// die Schleife durchläuft alle Kind-Komponeneten
	for(Debugger dk : this.debugger) {
	    // ... wird dabei ein weiteres Kompositum gefunden,
	    // wird dieses als nächstes durchsucht
	    if(dk.getClass() == this.getClass()) {
		
		// hier erfolgt jetzt der rekursive Aufruf der Methode removeDebugger()
		// Typ-cast notwendig, weil nur DebugKompositum die remove-Methode kennt
		((DebugKompositum)dk).removeDebugger( deb );
	    }

	    // die gefundene Komponenete wird gelöscht
	    if(dk == deb) {
		this.debugger.remove( deb );
		break;
	    }
	}
    }
}
