package com.logical;

    public class ReverseNumber {
	  public static void main(String[] args) {
		System.out.println("Enter a number");
        int number = Utility.getUserInteger();
        int reverse = reverseNum(number);
        System.out.println("Reverse number is: " + reverse);
	   }
	   private static int reverseNum(int num) {
	        int rem ;
	        int rev = 0;
	        int temp = num;

	        while (temp > 0) {
	            rem = temp % 10;
	            rev = rev * 10 + rem;
	            temp = temp /10;
	        }
	        return rev;
	    }

}
