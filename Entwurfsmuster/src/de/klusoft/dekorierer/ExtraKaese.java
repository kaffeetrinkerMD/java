package de.klusoft.dekorierer;


public class ExtraKaese extends SalamiPizzaRezept {

    public ExtraKaese( Pizza p ) {

	super( p );
    }

    public Float getPreis() {
	
	return this.pizza.getPreis();
    }
    
    public Float getExtras(Integer groesse) {
	
	return this.pizza.getExtras(groesse) + 0.25f;
    }
}
