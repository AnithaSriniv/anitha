package org.different;

import org.diff.Car;

public class Machines {	
	public void Tv() {
		System.out.println("LG");
	}
	public void Fridge() {
		System.out.println("Sony");
	}
	public static void main(String[] args) {
		Machines m = new Machines();
		m.Tv();
		m.Fridge();
		
		Car c = new Car();
		c.Dzire();
		c.Kwid();
	}

}
