package de.klusoft.strukturmuster;


public class DebugMain {

    public static void main( String[] args ) {

	String na1 = "Java macht Spaß!";
	String na2 = "der Mail-Debugger fehlt!";
	
	String trenner = "*** neuer Testbereich ***";
	
	DebugKompositum kompositum = new DebugKompositum();
	DebugKompositum kompSchachtel = new DebugKompositum();
	
	DebugLog debLog = new DebugLog();
	
	DebugEmail debMail = new DebugEmail();
	
	DebugSMS debSMS = new DebugSMS();
	
	kompositum.addDebugger( debLog );
	kompositum.addDebugger( debMail );
	kompositum.addDebugger( debSMS );
	
	kompSchachtel.addDebugger( debLog );
	kompSchachtel.addDebugger( debMail );
	kompSchachtel.addDebugger( debSMS );
	
	//kompositum.debug( nachricht );
	kompSchachtel.debug( na1 );
	
	kompSchachtel.removeDebugger( debMail );
	
	System.out.println( trenner );
	
	kompSchachtel.debug( na2 );
    }

}
