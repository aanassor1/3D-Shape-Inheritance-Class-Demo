package co1105.cw2.aan15;

/**
 * The Pyramid Class is based off square based pyramid. It has base and height attributes.
 * @author aan15
 */

public class Pyramid extends Solid {
	
	private int base;
	private int height;
	
	//Throw an exception if base or height is below 0.
	public Pyramid(int base, int height) throws InvalidSolidException {
		if (base < 0) {
			throw new InvalidSolidException("Base and height must be > 0");
		} else if (height < 0) { 
			throw new InvalidSolidException("Base and height must be > 0");
		}
		this.base = base;
		this.height = height;
	}

	public Pyramid(Pyramid other) {
		this.base = other.base;
		this.height = other.height;
	}
	
	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		if (this==other) return true;
		if (other==null) return false;
		if (! (other instanceof Pyramid)) return false;
		Pyramid that = (Pyramid) other;
		return this.base == that.base &&
			   this.height == that.height;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash=13;
		hash = hash + base + height;
		return hash;
	}
	
	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		double surfaceArea;
		surfaceArea = base * base + 2 * base * height;
		return surfaceArea;
	}

	@Override
	public double getVolume() {
		double volume;
		volume = (base * base * height)/3.0;
		return volume;
	}
	
	@Override
	public String toString() {
		String nameOfClass = "Pyramid";
		String endOfOutput = ": " + base + "x" + height;
		String output = nameOfClass + " " + getID() + endOfOutput;
		return output;
	}
}
