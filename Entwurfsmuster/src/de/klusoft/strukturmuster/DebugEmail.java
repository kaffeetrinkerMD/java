package de.klusoft.strukturmuster;


public class DebugEmail extends Debugger {

    @Override
    public void debug( String nachricht ) {

	System.out.println( this.getClass().getSimpleName() + ": " + nachricht );
    }

}
