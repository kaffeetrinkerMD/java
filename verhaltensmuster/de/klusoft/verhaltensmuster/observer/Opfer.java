package de.klusoft.verhaltensmuster.observer;

/**
 * Das Interface Opfer stellt die von den konkreten Klassen zu implementierenden Methoden bereit
 * @author benutzer
 *
 */
public interface Opfer {

    /**
     * Fügt einen neuen Beobachter zu dem Opfer hinzu 
     * @param stalker
     */
    public void attach(Stalker stalker);
    
    /**
     * Entfernt einen Stalker aus der Liste der Beobachter
     * @param stalker
     */
    public void deatch(Stalker stalker);
    
    /**
     * Informiert einen Beobachter über die Zustandsänderungen des Opfers
     */
    public void informiere();
    
}
