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
	
	if(this.debugger.contains( deb )) {
	    this.debugger.remove( this.debugger.indexOf( deb ) );
	}
    }
}
