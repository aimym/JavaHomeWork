package com.syntex.homework;

import java.util.Scanner;

public class Prac {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);

   System.out.println("In:");
   int x=scan.nextInt();
   for(int i=x-1; i>=0; i--) {
	   System.out.print(i+" ");
   }
scan.close();
}
}  
