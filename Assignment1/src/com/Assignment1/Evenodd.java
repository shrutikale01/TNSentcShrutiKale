package com.Assignment1;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     // Input number from user
     System.out.print("Enter a number: ");
     int number = scanner.nextInt();

     // Check even or odd
     if (number % 2 == 0) {
         System.out.println(number + " is Even.");
     } else {
         System.out.println(number + " is Odd.");
     }

     scanner.close();
 }
	

}
