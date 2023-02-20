package org.ssglobal.training.codes;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class MathOps {
	
	// Step 1: Create or Build the private logger object.
	private Logger logger = Logger.getLogger(MathOps.class.getName());
	
	
	
	public MathOps() {
		// Step 2: Set the level of the logging.
		logger.setLevel(Level.INFO);
		
		// Step 3: Create another handler.
		try {
			FileHandler fHandler = new FileHandler("./src/config/math.log", true);
			fHandler.setLevel(Level.ALL);
			fHandler.setEncoding("UTF-8");
			
			// Step 4: Create Format
			SimpleFormatter simple = new SimpleFormatter();
			
			fHandler.setFormatter(simple);
			logger.addHandler(fHandler);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MathOps(int x, int y) {
		logger.setLevel(Level.INFO);
		
		try {
			FileHandler fHandler = new FileHandler("./src/config/math.log", true);
			fHandler.setLevel(Level.ALL);
			fHandler.setEncoding("UTF-8");
			
			logger.addHandler(fHandler);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public int add(int x, int y) {
		logger.info("Start of method add() with parameters x = %d, y = %d".formatted(x,y));
		
		logger.warning("using custome Date() object");
		Date today = new Date(02,17,2023);
		System.out.println(today);
		int sum =  x + y;
		logger.info("End of method add() with parameters x = %d, y = %d".formatted(x,y));
		return sum;
	}
	
	public int div(int x , int y) throws ArithmeticException, Exception{
		// 
		logger.info("Start of method div() with parameters x = %d, y = %d".formatted(x,y));
		if (y == 0) {
			//
			logger.severe("Division by 0 error");
			throw new ArithmeticException();
		}
		
		//
		logger.info("End of method div() with parameters x = %d, y = %d".formatted(x,y));
		return x / y;
	}
	
	public int[] displayArray(int[] arrData) {
		logger.info("Start of method displayArray() with parameters arrData = %s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("Length of arrData: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch(NullPointerException e) {
			logger.severe(e.getMessage());
		}
		logger.info("End of method displayArray() with parameters arrData = %s".formatted(Arrays.toString(arrData)));
		return arrData;
	}
}
