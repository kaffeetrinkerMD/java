package de.kluhil;


public class AuftragD {

    private int id = 0;

    // Konstruktor
    AuftragD(int nummer) {

	this.id = nummer;
    }

    public int getId() {

	return this.id;
    }

    public String toString() {

	return this.getClass().getSimpleName() + " [" + this.id + "]";
    }
    
    @Override
    public int hashCode() {
	
	return this.id;
    }
    
    @Override
    public boolean equals(Object o) {
	
	return this.id == ((AuftragD) o ).id;
    }
}


