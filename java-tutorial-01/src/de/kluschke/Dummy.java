package de.kluschke;

public class Dummy implements Beispiel {

    @Override			//	Annotation: es wird etwas überschrieben
    public void dummyA() {

	System.out.println("Ich bin ein Dummy A.");
    }

    @Override
    public void dummyB() {

	System.out.println("Ich bin ein Dummy B.");
    }

}
