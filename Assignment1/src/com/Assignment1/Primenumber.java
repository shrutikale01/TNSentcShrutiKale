package com.Assignment1;
import java.util.Scanner;
public class Primenumber {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     // Input number from user
	     System.out.print("Enter a number: ");
	     int n = scanner.nextInt();
	      
	     boolean isPrime = true;

	        if (n <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime)
	            System.out.println("Number is prime");
	        else
	            System.out.println("Number is not prime");

		 scanner.close();

	 }
}
