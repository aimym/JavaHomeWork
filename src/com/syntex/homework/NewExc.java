package com.syntex.homework;

public class NewExc {
public static void main(String[] args) {
	
	int a=99;
	
	while (a>0) {
		System.out.print(a);
		a-=2;  
	}
	System.out.println("--------------------------------");
	
	for (int d=99; d>0; d-=2) { 
		System.out.print(d + " ");
	}
	System.out.println("-------------------------------------------------");
	
	for (int b=20; b<=50; b++) {
		if (b%2==1) {
			System.out.print(b + " ");   
		}
	}
	
	System.out.println("------------------------------------------------------------------");
	System.out.println("----------------------------------------------------------------------");
	
   int f=10;
	do {
		System.out.print("Morning ");
		f++;
	}while(f<=13);
	
	
	
	System.out.println("------OUTSIDE CODE--------------------");
	
	System.out.println("------------------------------------------");
	
	int k=50;
	while(k<=100) {
		System.out.print(k + " ");
		k+=1; 
}
	System.out.println("------------OUT----------------------");
	
	
	
}
}
