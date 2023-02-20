package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelciusx{
	public static void main( String [] args ) {
		// declare and initialize data
		double celcius;
		double fahrenheit = 22.6;
		// calculate celsius equivalent
		celcius =  (fahrenheit - 32) * 5 /9;
		// output results
		System.out.print( fahrenheit + "\u00B0F = ");
		System.out.print( String.format("%.2f", celcius) + "\u00B0C" );
	}
}

/**
 * Compilation Errors
 * 
 * 1. float Celsius, data type error. Should be double.
 * 2. float Fahrenheit, data type error. Should be double.
 * 3. The letter 'f' in double celsius = (5/9) * fahrenheit -32,
 * should be capital F.
 * 4. The letter 'f' in System.out.println(fahrenheit, "\U00B0F ="),
 * should be capital F.
 * 5. Variable not found in System.out.println(celcius, "u00B0C"),
 * should be 'celsius.
 * 6. The format of degrees Fahrenheit, should be "\u00B0F" not "\U00B0F =".
 * 7. The printing format should be + sign not comma in 
 * System.out.println(fahrenheit, "\U00B0F =")
 * 8. The printing format should be + sign not comma in
 * System.out.println(celcius, "u00B0C") 
 *
 */

/**
 * Logic Error
 * Float Celsius must not have value or set to 0 when instantiated.
 * The formula should be (fahrenheit - 32) * 5/9
 */

/**
 * User-experience
 * Not following Coding Convention Standards
 * Not following Naming Convention Standards
 * Logical Errors
 * 
 * Readability Error
 * 
 * Printing Format
 */
