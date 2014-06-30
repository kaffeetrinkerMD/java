package de.klusoft.verhaltensmuster.iterator;


public interface Iterierbar {
    
    public Car current();
    
    public int key();
    
    public void next();
    
    public void rewind();
    
    public boolean valid();

}
