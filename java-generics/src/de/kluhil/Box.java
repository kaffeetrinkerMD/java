package de.kluhil;


/**
 * Die Klasse Box soll **beliebigen** Inhalt haben können:
 * 
 * Ganze Zahlen, Zeichenketten ...
 * @author benutzer
 *
 */

public class Box {

    private Object content = null;
    
    // setzt den Inhalt der Box
    public void set( Object o ) {
	
	this.content = o;
    }
    
    // liefert den Inhalt der Box
    public Object get() {
	
	return this.content;
    }
}
