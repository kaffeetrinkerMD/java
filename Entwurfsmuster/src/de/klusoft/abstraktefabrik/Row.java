package de.klusoft.abstraktefabrik;

import java.util.ArrayList;


public abstract class Row {

    // beliebig viele Zellen
    protected ArrayList<Cell> cells = new ArrayList<>();
    
    // Möglichkeit, um Zellen zu einer Zeile hinzuzufügen
    public void addCell(Cell c) {
	
	this.cells.add( c );
    }
    
    // abstrakte Methode zum Zeichnen der Zeile
    public abstract void display();
}
