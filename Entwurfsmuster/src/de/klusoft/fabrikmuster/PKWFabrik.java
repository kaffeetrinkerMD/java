package de.klusoft.fabrikmuster;

public class PKWFabrik extends Fabrik {

	// Konstruktor (ruft den Konstruktor der Basisklasse auf)
		public PKWFabrik(String n){
			super(n);
		}
		
		@Override
		protected Produkt herstellen() {
			// TODO Auto-generated method stub
			return new PKW();
		}
}
