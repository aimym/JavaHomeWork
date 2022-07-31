package com.syntex.homework;

public class Dog {

	String name;
	String color;
	static int numOfLegs=4;
	void eat() {
		int noOfTime=3;
		System.out.println(name+" "+color+" "+noOfTime);
		
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="Scooby";
		dog.color="White";
		Dog.numOfLegs=4;
		dog.eat();
	}  
}
