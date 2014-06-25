package de.klusoft.dekorierer;


public class ExtraSardinen extends SalamiPizzaRezept {

    public ExtraSardinen( Pizza p ) {

	super( p );
    }

    @Override
    public Float getPreis() {

	return this.pizza.getPreis();
    }

    @Override
    public Float getExtras(Integer groesse) {

	return this.pizza.getExtras(groesse) + 0.5f;
    }
}
