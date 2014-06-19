package de.kluschke;

public abstract class Tutorial {

    abstract public void irgendwas();

    //	als fertige Methode hier beispielhaft toString()
    public String toString(){

	//	getClass() liefert den voll qualifizierten Klassennamen
	//	getSimpleName() extrahiert daraus den einfachen Klassennamen
	return this.getClass().getSimpleName();
    }
}
