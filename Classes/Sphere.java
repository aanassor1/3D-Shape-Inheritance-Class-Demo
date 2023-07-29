package co1105.cw2.aan15;

/**
 * The sphere class. It has a Radius attribute.
 * @author aan15
 */

public class Sphere extends Solid {
	
	private int radius;
	
	//If the radius is below 0 when making the class, throw an exception.
	public Sphere(int r) throws InvalidSolidException {
		if (r < 0) {
			throw new InvalidSolidException("Radius must be > 0");
		}
		radius = r;
	}
	
	public Sphere(Sphere other) {
		this.radius = other.radius;
	}
	
	@Override
	public boolean equals(Object other) { 
		// TODO Auto-generated method stub
		if (this==other) return true;
		if (other==null) return false;
		if (! (other instanceof Sphere)) return false;
		Sphere that = (Sphere) other;
		return this.radius == that.radius;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash=13;
		hash = hash + radius; 
		return hash;
	}
	
	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		double surfaceArea;
		surfaceArea = 4.0 * Math.PI *radius * radius;
		return surfaceArea;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double volume;
		volume = (4.0 * Math.PI * radius * radius * radius)/3.0;
		return volume;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String nameOfClass = "Sphere";
		String endOfOutput = ": r=" + radius;
		String output = nameOfClass + " " + getID() + endOfOutput;
		return output;
	}
}
