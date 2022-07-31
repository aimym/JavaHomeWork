package com.syntex.homework;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	
    Scanner scan=new Scanner(System.in);	
    String answer;
    
    do {
    	System.out.println("Would you like apply for a credit card?");
    	answer=scan.nextLine();
    }while(!answer.equalsIgnoreCase("yes"));
    
    System.out.println("Here your card");
	
	scan.close(); 
	
	
	
	
	
	
	
	
	
	
	
}
}
