package co1105.cw2.aan15;
import java.util.Arrays;

/**
 * The Cuboid object contains attributes of length, width height (d1, d2, d3 respectively)
 * @author aan15
 */

public class Cuboid extends Solid {
	
	private int length;
	private int height;
	private int width;
	
	// Throw an exception if any of the dimensions are below 0.
	public Cuboid(int d1, int d2, int d3) throws InvalidSolidException {
		if (d1 < 0) {
			throw new InvalidSolidException("All dimensions must be > 0");
		} else if (d2 < 0) { 
			throw new InvalidSolidException("All dimensions must be > 0");
		} else if (d3 < 0) { 
			throw new InvalidSolidException("All dimensions must be > 0");
		}
		length = d1;
		height = d2;
		width = d3;
	}

	public Cuboid(Cuboid other) {
		this.length = other.length;
		this.height = other.height;
		this.width = other.width;
	}
	
	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		if (this==other) return true;
		if (other==null) return false;
		if (! (other instanceof Cuboid)) return false;
		Cuboid that = (Cuboid) other;
		return this.getSurface() == that.getSurface();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash=13;
		hash = hash + length + height + width;
		return hash;
	}
	
	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		double surfaceArea;
		surfaceArea = height * width * 2 + height * length * 2 + width * length * 2;
		return surfaceArea;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double volume;
		volume = height * width * length;
		return volume;
	}
	
	@Override
	public String toString() {
		int[] dimensions = {length, height, width};
		Arrays.sort(dimensions);
		int length = dimensions[0];
		int height = dimensions[1];
		int width = dimensions[2];
		String nameOfClass = "Cuboid";
		String endOfOutput = ": " + length + "x" + height + "x" + width;
		String output = nameOfClass + " " + getID() + endOfOutput;
		return output;
	}
}
