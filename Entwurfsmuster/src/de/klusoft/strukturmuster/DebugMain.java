package de.klusoft.strukturmuster;


public class DebugMain {

    public static void main( String[] args ) {

	String nachricht = "Java macht Spaß!";
	String trenner = "*** neuer Testbereich ***";
	
	DebugKompositum kompositum = new DebugKompositum();
	
	DebugLog debLog = new DebugLog();
	
	DebugEmail debMail = new DebugEmail();
	
	DebugSMS debSMS = new DebugSMS();
	
	kompositum.addDebugger( debLog );
	kompositum.addDebugger( debMail );
	kompositum.addDebugger( debSMS );
	
	kompositum.debug( nachricht );
	
	kompositum.removeDebugger( debMail );
	
	System.out.println( trenner );
	
	kompositum.debug( nachricht );
    }

}
