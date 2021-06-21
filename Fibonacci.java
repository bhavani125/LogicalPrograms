package com.logical;
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int num = Utility.getUserInteger();
		  fibonacci(num);
    }
    private static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 1;
        while (i<=num-2) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
            i++;
        }
    }

}
