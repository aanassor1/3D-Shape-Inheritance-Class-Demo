package co1105.cw2.aan15;

/**
 * Extended class of Exception. It will write a special message if there is an exception thrown by any of the solids
 * if the solids attempt to make an object with any dimensions below 0.
 * @author aan15
 */

public class InvalidSolidException extends Exception {
	
	public InvalidSolidException () {
		super();
	}
	
	public InvalidSolidException (String message) {
		super(message);
	}

}