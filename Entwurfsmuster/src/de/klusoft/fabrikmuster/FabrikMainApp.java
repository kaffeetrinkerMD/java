package de.klusoft.fabrikmuster;

public class FabrikMainApp {

    /**
     * @param args
     */
    public static void main(String[] args) {

	// wir erzeugen eine konkrete PKWFabrik
	PKWFabrik pkwFabrik = new PKWFabrik("Magdeburg");

	PKW p1 = (PKW) pkwFabrik.erzeuge();
	PKW p2 = (PKW) pkwFabrik.erzeuge();
	PKW p3 = (PKW) pkwFabrik.erzeuge();

	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	// wir erzeugen eine konkrete LKWFabrik
	LKWFabrik lkwFabrik = new LKWFabrik("Magdeburg");

	LKW l1 = (LKW) lkwFabrik.erzeuge();
	LKW l2 = (LKW) lkwFabrik.erzeuge();
	LKW l3 = (LKW) lkwFabrik.erzeuge();

	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l3);

	// wir erzeugen eine konkrete MotorradFabrik
	MotorradFabrik motorradFabrik = new MotorradFabrik("Magdeburg");

	Motorrad m1 = (Motorrad) motorradFabrik.erzeuge();
	Motorrad m2 = (Motorrad) motorradFabrik.erzeuge();
	Motorrad m3 = (Motorrad) motorradFabrik.erzeuge();

	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);

	// wir erzeugen eine konkrete FlugzeugFabrik
	FlugzeugFabrik flugzeugFabrik = new FlugzeugFabrik("Magdeburg");

	Flugzeug f1 = (Flugzeug) flugzeugFabrik.erzeuge();
	Flugzeug f2 = (Flugzeug) flugzeugFabrik.erzeuge();
	Flugzeug f3 = (Flugzeug) flugzeugFabrik.erzeuge();

	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	
	
	// Alternative: Fabrikmethode
	Fabrikmethode fm = new Fabrikmethode();
	
	PKW p4 = (PKW) fm.erzeuge( "PKW" );
	
	LKW l4 = (LKW) fm.erzeuge( "LKW" );
	
	Motorrad m4 = (Motorrad) fm.erzeuge( "Motorrad" );
	
	Flugzeug f4 = (Flugzeug) fm.erzeuge( "Flugzeug" );
	
	System.out.println(p4);
	System.out.println(l4);
	System.out.println(m4);
	System.out.println(f4);
    }

}
