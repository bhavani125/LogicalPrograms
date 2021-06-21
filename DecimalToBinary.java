package com.logical;

    public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter a decimal number");
		int dec = Utility.getUserInteger();
        toBinary(dec);
    }
	private static void toBinary(int n) {
        int[] binaryNum = new int[20];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
