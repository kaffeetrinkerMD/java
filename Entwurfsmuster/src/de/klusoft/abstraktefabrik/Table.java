package de.klusoft.abstraktefabrik;

import java.util.ArrayList;


public abstract class Table {

    // eine Kopfzeile
    protected Header header = null;
    
    // beliebig viele Datenzeilen
    //protected ArrayList<Row> rows = null; // dann unbedingt Konstruktor, sonst
    protected ArrayList<Row> rows = new ArrayList<>();
    
    // Methode, um zur Tabelle eine Kopfzeile hinzuzufügen
    public void setHeader(Header h) {
	
	this.header = h;
    }
    
    // Methode, um zur Tabelle eine Datenzeile hinzuzufügen
    public void addRow(Row r) {
	this.rows.add( r );
    }
    
    // abstrakte Methode zum Zeichnen der Tabelle
    public abstract void display();
}
