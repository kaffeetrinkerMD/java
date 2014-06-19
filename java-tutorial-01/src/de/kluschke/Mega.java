package de.kluschke;

public class Mega extends Tutorial {

    @Override
    public void irgendwas() {

	System.out.println("Mega erweitert Tutorial");
    }

    @Override
    public String toString(){

	//	wir rufen aus der übergeordneten Klasse die Methode toString auf
	//	und hängen daran eine weitere Zeichenkette
	return super.toString()+" begrüßt die Welt!";
    }

}
