package de.klusoft.strukturmuster;


public class DebugSMS extends Debugger {

    @Override
    public void debug( String nachricht ) {

	System.out.println( this.getClass().getSimpleName() + ": " + nachricht  );
    }

}
