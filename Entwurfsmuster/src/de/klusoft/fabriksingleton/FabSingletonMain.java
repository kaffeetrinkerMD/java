package de.klusoft.fabriksingleton;


public class FabSingletonMain {

    public static void main( String[] args ) {

	LKWFabrikS ls1 = (LKWFabrikS) LKWFabrikS.getInstance(); 

	ls1.erzeuge();
	System.out.println(ls1);

	LKWFabrikS ls2 = LKWFabrikS.getInstance(); 

	ls2.erzeuge();
	System.out.println(ls2);

	LKWFabrikS ls3 = LKWFabrikS.getInstance(); 

	ls3.clone();
	System.out.println(ls3);
    }

}
