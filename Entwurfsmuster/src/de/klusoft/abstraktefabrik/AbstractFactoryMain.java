package de.klusoft.abstraktefabrik;


public class AbstractFactoryMain {

    public static void main( String[] args ) {

	String [][] tabelle = new String[3][5];

	// Kopfzeile
	String [] head = new String[5];
	tabelle[1]= head;
	tabelle[0][0] = "Ü1";
	tabelle[0][1] = "Ü2";
	tabelle[0][2] = "Ü3";
	tabelle[0][3] = "Ü4";
	tabelle[0][4] = "Ü5";

	// 1. Datenzeile
	String [] d1 = new String[5];
	tabelle[1]= d1;
	tabelle[1][0] = "10";
	tabelle[1][1] = "20";
	tabelle[1][2] = "30";
	tabelle[1][3] = "40";
	tabelle[1][4] = "50";

	// 2. Datenzeile
	String [] d2 = new String[5];
	tabelle[2] = d2;
	tabelle[2][0] = "1000";
	tabelle[2][1] = "2000";
	tabelle[2][2] = "3000";
	tabelle[2][3] = "4000";
	tabelle[2][4] = "5000";
	
	// die Fabrik
	//HTMLFactory fabrik = new HTMLFactory();
	TextFactory fabrik = new TextFactory();
	
	// ... Client
	Client client = new Client(fabrik);
	
	// die Ausgabe
	try {
	    client.showData( tabelle );
	}catch (Exception e) {
	    
	}
	
    }

}
