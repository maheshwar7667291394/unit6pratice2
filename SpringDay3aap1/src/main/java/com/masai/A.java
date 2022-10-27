package com.masai;

public class A {
	private String message;
	private String name;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		
		System.out.println("nmae id "+name);
		System.out.println("message is "+message);
	}
	

}
