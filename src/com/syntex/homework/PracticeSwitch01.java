package com.syntex.homework;

import java.util.Scanner;

public class PracticeSwitch01 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in); 
      System.out.println("Enter number one");
	  int num1=scan.nextInt();
	
	System.out.println("enter number two");
	int num2=scan.nextInt();
	
	System.out.println("Enter what operator you want to use");
	String operator=scan.next();
     int math=0;
    
     switch (operator) {  
    case "+":
    	math=num1+num2;
    	break;
    case "-":
    	math=num1-num2;
    	break;
    case "*":
    	math=num1*num2; 
    	break;
    case "/":
    	math=num1/num2;
    	break;
    	default:
    		System.out.println("Invalid");
    	 }

     System.out.println(num1 + operator + num2 + "=" + math);
     
     scan.close();
}
}
