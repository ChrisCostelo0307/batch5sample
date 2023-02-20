package org.ssglobal.training.codes.itemA;

public class Temperature {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		tempc = fTOc(tempf);
		
		System.out.println("Body temp in C is: " + tempc);
	}

	// Converts Fahrenheit temperatures to Celcius.
	public static double fTOc(double tempf) {
		return tempf = (tempf - 32) * 5 / 9;	
	}
}
