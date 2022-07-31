package com.syntax.array;

public class Practice01 {
public static void main(String[] args) {
	
	//From an array of integers elements find the largest number
	
	int [] numbers= {50,20,70,60};  
	int largest=numbers[0]; 
	for(int num:numbers) {
		if(num>largest) { 
			largest=num;
		}
	} 
	System.out.println(largest);         
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
}
