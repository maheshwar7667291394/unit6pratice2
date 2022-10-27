package com.masai;

public class Travel {
	
	private Vehicle v;
	private int numberOfPassenger;
	
	
	public void setV(Vehicle v) {
		this.v = v;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	
public void jurny() {
	v.go();
	System.out.println("juny started");
	System.out.println("number of passengers is "+numberOfPassenger);
}

}
