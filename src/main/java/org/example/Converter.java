package org.example;

public class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }
}
