/**
 * 
 */
package de.klusoft.verhaltensmuster.observer;


/**
 * Interface Vehicle stellt alle zu implementierenden Methoden bereit
 * @author benutzer
 *
 */
public interface Vehicle {

    public void startEngine();
    
    public void StopEngine();
    
    public void moveForward(Integer km);
}
