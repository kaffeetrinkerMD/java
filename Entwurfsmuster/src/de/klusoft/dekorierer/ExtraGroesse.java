package de.klusoft.dekorierer;


public class ExtraGroesse extends SalamiPizzaRezept {

    public ExtraGroesse( Pizza p ) {

	super(p);
    }

    public Float getExtras(Integer groesse) {

	Float extraPreis = 0f;

	switch (groesse) {
	case 1:
	    extraPreis = this.getPreis() + 1.0f;
	    break;
	case 2:
	    extraPreis = this.getPreis() + 2f;
	    break;
	case 3:
	    extraPreis = this.getPreis() + 3f;
	    break;
	case 4:
	    extraPreis = this.getPreis() + 4f;
	    break;

	}

	return extraPreis;
    }

    @Override
    public Float getPreis() {

	return this.pizza.getPreis();
    }
}
