package de.klusoft.verhaltensmuster.observer;

/**
 * Das Interface Stalker stellt die von den konkreten Klassen zu implementierenden Methoden bereit
 * @author benutzer
 *
 */
public interface Stalker {

    /**
     * Über die Methode werden alle Beobachter informiert, dass sich etwas am Zustand des Opfers
     * verändert hat
     * @param opfer
     */
    public void update(Opfer opfer);
}
