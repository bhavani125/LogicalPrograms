package com.logical;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number = Utility.getUserInteger();
        int i;
        int Sum = 0;
        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == number) {
            System.out.format("%d is a Perfect Number", number);
        }
        else {
            System.out.format("%d is NOT a Perfect Number", number);
        }
    }
}
