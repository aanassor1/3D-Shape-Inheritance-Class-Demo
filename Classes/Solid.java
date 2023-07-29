package co1105.cw2.aan15;

import java.lang.Comparable;
/**
 * Abstract class to represent Solids.
 * @author aan15
 */
abstract class Solid implements Comparable<Solid> {
	
  // Attributes and methods for the sub classes.
  public abstract boolean equals (Object other);
  public abstract int hashCode();
  public abstract double getSurface();
  public abstract double getVolume();
  public abstract String toString();

  protected static int solidCount=0;
  protected int solidID;
  
  public Solid() {
	  solidID=++solidCount; //Set unique ID
  }
  
  public int getID() {
	  return solidID;
  }
 
  
  public int compareTo (Solid other) {
    // This method compares solids by their surface area
    if (this.getSurface() < other.getSurface()) {
    	return -1;
    } else if (this.getSurface() > other.getSurface()) {
    	return 1;
    } else {
    	return 0;
    }
  }
}
