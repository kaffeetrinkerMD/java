package de.klusoft.treeset;

import java.util.Comparator;

/**
 * eine generische Klasse, die dem Vergleich von Leistung dient.<br>
 * Leistungsvergleiche lassen sich anstellen mit ALLEN Klassen, die MotorFahrzeug erweitern<br>
 * 
 * <T extends MotorFahrzeug> (Typparameter mit Einschränkung)
 * 
 * @author klusoft
 *
 * @param <T> wird zeitgleich an das Interface Comparator weitergeleitet
 */
public class VergleichLeistung<T extends MotorFahrzeug> implements Comparator<T> {

    @Override
    public int compare( T t1, T t2 ) {

	int retVal = -1;
	
	if(t1.leistung == t2.leistung) {
	    retVal = 0;
	}
	
	if(t1.leistung > t2.leistung) {
	    retVal = 1;
	}
	return retVal;
    }
}
