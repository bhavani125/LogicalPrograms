package com.logical;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Enter 1 for: Celsius to Fahrenheit conversion");
        System.out.println("Enter 2 for: Fahrenheit to Celsius conversion");
        int conversion = Utility.getUserInteger();

        switch (conversion) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                System.out.println("Enter proper conversion mode.");
                break;
        }
    }

    private static void fahrenheit() {
        System.out.print("Enter a temperature in Celsius: ");
        final float temp = Utility.getUserFloat();     // it stores the temperature
        float fahrenheit ;
        fahrenheit = (temp*9/5) + 32;
        System.out.printf("Fahrenheit : %.1f", fahrenheit);

    }

    private static void celsius() {
        System.out.print("Enter a temperature in Celsius: ");
        float temp = Utility.getUserFloat();     // it stores the temperature
        float celsius ;
        celsius = (temp-32)* 5 / 9;
        System.out.printf("Celsius : %.1f", celsius);
    }
}
