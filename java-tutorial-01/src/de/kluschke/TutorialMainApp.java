package de.kluschke;

public class TutorialMainApp {

    public static void main(String[] args) {

	/*
	 * println() mit Zeilenumbruch
	 * print() ohne Zeilenumbruch
	 */
	System.out.println("Hallo Welt!");
	System.out.println("Java für Anfänger!");

	//	Demoobjekt erzeugen und ausgeben
	Demo d = new Demo();

	System.out.println(d);

	//	wir erzeugen uns ein Dummy - Objekt
	Dummy dummy = new Dummy();

	dummy.dummyA();
	dummy.dummyB();

	//	Erzeugung von Mega - Objekt
	Mega m = new Mega();

	m.irgendwas();

	System.out.println(m);
    }

}
