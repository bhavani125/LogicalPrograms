package com.logical;

  import java.util.Scanner;

     public class MonthlyPayment {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Loan Amount");
		 float principleAmt = sc.nextFloat();
	        System.out.print("Enter years to pay off the loan: ");
	        int year = sc.nextInt();
	        System.out.print("Enter a rate of interest: ");
	        float roi = sc.nextFloat();

	        monthlyPayment(principleAmt, year, roi);
	}
	 private static void monthlyPayment(float P, int Y, float R) {
	        int n = Y * 12;     // number of months for 'y' years
	        float r = R / (12*100);
	        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
	        System.out.printf("Monthly payment: %.2f", payment);
	    }

}
