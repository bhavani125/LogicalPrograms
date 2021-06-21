package com.logical;

import java.util.Scanner;

public class Utility {
	
	private static final Scanner sc = new Scanner(System.in); 
			
				public static int getUserInteger() {
				  return sc.nextInt();
			    }
				
				
				public static  double getRandomDouble() {
					return Math.random();
				}
				
				public static char getUserChar() {
					return sc.next().charAt(0);
				}
				public static float getUserFloat() {
					return sc.nextFloat();
				}
				
		}


