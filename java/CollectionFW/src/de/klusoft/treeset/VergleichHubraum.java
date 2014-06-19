package de.klusoft.treeset;

import java.util.Comparator;

/**
 * eine generische Klasse, die dem Vergleich von Hubraum dient.<br>
 * Hubraumvergleiche lassen sich anstellen mit ALLEN Klassen, die MotorFahrzeug erweitern<br>
 * 
 * <T extends MotorFahrzeug> (Typparameter mit Einschränkung)
 * 
 * @author klusoft
 *
 * @param <T> wird zeitgleich an das Interface Comparator weitergeleitet
 */
public class VergleichHubraum<T extends MotorFahrzeug> implements Comparator<T> {

    /**
     * DerVergleich liefert wieder einen 
     * ... negativen Wert	falls Hubraum von (Objekt) t1 < Hubraum von(Objekt) t2
     * ... 0			falls Hubraum t1 = Hubraum t2
     * ... positiven Wert	falls Hubraum t1 > Hubraum t2
     * @param t1
     * @param t2
     * @return
     */
    @Override
    public int compare(T t1, T t2) {
	
	int retVal = -1;
	
	if(t1.hubraum == t2.hubraum) {
	    retVal = 0;
	}
	
	if(t1.hubraum > t2.hubraum) {
	    retVal = 1;
	}
	
	return retVal;
    }
}
