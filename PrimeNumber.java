package com.logical;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		int num = Utility.getUserInteger();
		 isPrime(num);
	}

	   private static void isPrime(int num) {
	    int i = 2;
	    int count = 0;
	    if (num == 1 || num == 0) {
	        count++;
	        System.out.println(num + " is not a prime number.");
	    } else {
	        while(i<=num/2) {
	            if (num%i == 0) {
	            	count++;
	            }
	            i++;
	        }
	        if (count == 0)
	            System.out.println(num + " is prime number");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	   }
}
