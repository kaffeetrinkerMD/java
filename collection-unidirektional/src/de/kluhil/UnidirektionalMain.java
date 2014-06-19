package de.kluhil;


public class UnidirektionalMain {

    public static void main( String[] args ) {

	KundeD anton = new KundeD();

	AuftragD ad1 = new AuftragD(1);
	AuftragD ad2 = new AuftragD(2);
	AuftragD ad3 = new AuftragD(3);
	AuftragD ad4 = new AuftragD(4);
	AuftragD ad5 = new AuftragD(5);
	AuftragD ad6 = new AuftragD(6);

	// HashCodes der Aufträge ausgeben, der von der Methode hashCodes() der Klasse Object bereitgestellt wird
	System.out.println( ad1.hashCode() );
	System.out.println( ad2.hashCode() );
	System.out.println( ad3.hashCode() );
	System.out.println( ad4.hashCode() );
	System.out.println( ad5.hashCode() );
	System.out.println( ad6.hashCode() );
	
	anton.auftragHinzufuegen(ad1);
	anton.auftragHinzufuegen(ad2);
	anton.auftragHinzufuegen(ad3);
	anton.auftragHinzufuegen(ad4);
	anton.auftragHinzufuegen(ad5);
	anton.auftragHinzufuegen(ad6);

	System.out.println( anton );



    }

}
