package de.klusoft.hashmap;



public class KundeAuftragHashMapMain {

	public static void main(String[] args) {

		// Objekt der Klasse Kunde erzeugen
		Kunde anton = new Kunde();

		// Objekt(e) der Klasse Auftrag erzeugen
		Auftrag auftrag1 = new Auftrag(100);
		Auftrag auftrag2 = new Auftrag(200);
		Auftrag auftrag3 = new Auftrag(300);
		Auftrag auftrag4 = new Auftrag(400);
		Auftrag auftrag5 = new Auftrag(500);
		Auftrag auftrag6 = new Auftrag(600);
		Auftrag auftrag7 = new Auftrag(700);
		Auftrag auftrag8 = new Auftrag(800);
		Auftrag auftrag9 = new Auftrag(900);
		Auftrag auftrag10 = new Auftrag(1000);

		// Aufträge für "anton" registrieren
		anton.registriereAuftrag(auftrag1);
		anton.registriereAuftrag(auftrag2);
		anton.registriereAuftrag(auftrag3);
		anton.registriereAuftrag(auftrag4);
		anton.registriereAuftrag(auftrag5);
		anton.registriereAuftrag(auftrag6);
		anton.registriereAuftrag(auftrag7);
		anton.registriereAuftrag(auftrag8);
		anton.registriereAuftrag(auftrag9);
		anton.registriereAuftrag(auftrag10);

		// einen Auftrag anzeigen
		System.out.println("--- einen Auftrag anzeigen ---");
		System.out.println(anton.holeEinenAuftrag(100));

		// Duplikatsversuch
		anton.registriereAuftrag(auftrag1);
		System.out.println("--- Duplikatsversuch ---");
		System.out.println(anton.holeEinenAuftrag(100));

		// Aufträge entfernen
		anton.entferneEinenAuftrag(auftrag5);
		System.out.println("--- Auftrag 500 gelöscht? ---");
		if(anton.holeEinenAuftrag(500) == null){
			System.out.println("Der Auftrag ist nicht vorhanden!");
		}
		//System.out.println(anton.holeEinenAuftrag(500));
		
		// HashMap 'auftraege' anzeigen
		System.out.println("--- Alle Aufträge anzeigen ---");
		System.out.println(anton);
		
		// alle Aufträge nach dem clear der HashMap anzeigen
		anton.entferneAlleAuftraege();
		System.out.println("--- Alle Aufträge anzeigen nach entferneAlleAuftraege() ---");
		System.out.println(anton);
	}

}
