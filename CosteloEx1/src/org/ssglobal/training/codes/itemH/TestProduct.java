package org.ssglobal.training.codes.itemH;


class Product{
	public String prodName;
	public int pcs;
	
	public void downLoad(int qty) {
		pcs += qty;
	}
	public void upLoad(int qty) {
		pcs -= qty;
	}
	public String print() {
		return prodName + ", " + pcs; 
	}
}

public class TestProduct {
	public static void main(String[] args) {
		
		Product lamp = new Product();
		lamp.prodName = "IKEA LAMP";
		lamp.pcs = 10000;
		System.out.println("Before Loading: " + lamp.print() + " pieces.");
		lamp.downLoad(1000);
		lamp.upLoad(100);
		System.out.println("After Loading: " + lamp.print() + " pieces.");
	}
}
