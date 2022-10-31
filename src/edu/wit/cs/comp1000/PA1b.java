package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
Scanner input = new Scanner(System.in);
		
		
		int totalinches;
		System.out.printf("Enter number of inches: ");
		
		totalinches = input.nextInt();
		
		int yards;
		
		yards = totalinches/36;
		
		System.out.printf("yards:%d%n", yards);
		int feet;
		feet = totalinches%36/12;
		
		 System.out.printf("feet:%d%n", feet);
		 
		 int inches;
			inches = totalinches%36%12/1;
			
			 System.out.printf("inches:%d%n", inches);
	}

}
