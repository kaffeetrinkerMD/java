package de.klusoft.fabrikmuster;


public class Fabrikmethode {

    public Produkt erzeuge(String produktArt) {
	
	Produkt retVal = null;
	
	switch(produktArt) {
	case "PKW":
	    retVal = new PKW();
	    break;
	case "LKW":
	    retVal = new LKW();
	    break;
	case "Motorrad":
	    retVal = new Motorrad();
	    break;
	case "Flugzeug":
	    retVal = new Flugzeug();
	    break;
	}
	
	return retVal;
    }
}
