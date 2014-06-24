package de.klusoft.strukturmuster;


public class DebugLog extends Debugger {

    @Override
    public void debug( String nachricht ) {

	System.out.println( this.getClass().getSimpleName() + ": " + nachricht  );
    }

}
