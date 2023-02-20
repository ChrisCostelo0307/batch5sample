package org.ssglobal.training.codes.itemA;

public class Oops {
	public static void main(String[] args) {
		int a = 7;
		int b = 42;
		int smaller = minimum(a,b);
		
		if (smaller == a) {
			System.out.println("a is the smallest!");
		}else {
			System.out.println("b is the smallest!");
		}
	}
	
	/*
	 	returns which int is smaller
	*/
	public static int minimum(int a, int b) {
		if (a < b) {
			return a;// early / pre-mature return
		}else {
			return b;
		}
	}
}
