package com.masai;

public class Demo {
	
	private A a1;
	private A a2;
	private B b;
	public Demo() {
		System.out.println("inside zero argument constructor");
	}
	public Demo(A a1, A a2, B b) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.b = b;
		System.out.println("inside three argument construntor");
	}
	public Demo(A a1, B b) {
		super();
		this.a1 = a1;
		this.b = b;
		System.out.println("inside twio argument constructor");
	}
	
	public void swhow() {
		System.out.println("a1 is"+a1);
		System.out.println("a2 is"+a2);
		System.out.println("b1 is "+b);
	}
	
}
