package com.syntex.homework;

public class AccessModifiers {

	private String name="Sonia";
	int age=51;
	protected double weight=100;
	public String color="White";
	
	public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers();
		System.out.println(am.name);
		System.out.println(am.age);
		System.out.println(am.weight);
		System.out.println(am.color);  
	}
}
