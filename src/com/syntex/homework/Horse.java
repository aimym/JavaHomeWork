package com.syntex.homework;

public class Horse {

	private String name;
	private int age;
	
	Horse(String setName, int setAge){
		name=setName;
		age=setAge;
	}
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
}
  