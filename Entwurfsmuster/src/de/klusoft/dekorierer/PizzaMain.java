package de.klusoft.dekorierer;


public class PizzaMain {

    public static void main( String[] args ) {

	Pizza pizza = new SalamiPizza();
	
	Pizza grossePizza = new ExtraGroesse(pizza);
	
	Pizza extraKaese = new ExtraKaese(grossePizza);
	
	Pizza extraSard = new ExtraSardinen(extraKaese);
	
	
	System.out.println("Normale Pizza: " + pizza.getPreis() );
	System.out.println("große Pizza:" + grossePizza.getExtras(1) );
	System.out.println("große Pizza mit Kaese:" + extraKaese.getExtras(1) );
	System.out.println("große Pizza mit Kaese und Sardinen:" + extraSard.getExtras(1) );
    }

}
