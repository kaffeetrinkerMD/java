package de.klusoft.fabrikmuster;

public class MotorradFabrik extends Fabrik {

	// Konstruktor (ruft den Konstruktor der Basisklasse auf)
		public MotorradFabrik(String n){
			super(n);
		}
		
		@Override
		protected Produkt herstellen() {
			return new Motorrad();
		}
}
