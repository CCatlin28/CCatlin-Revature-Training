package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection;
		
		
		
		System.out.println("Please type the number of a Conversion Category:");
		System.out.println("1. Temperature");
		System.out.println("2. Volume");
		System.out.println("3. Distance");
		System.out.println("4. Quit");
		
		Scanner scan = new Scanner(System.in);
		menuSelection = scan.nextInt();
		
		if ( menuSelection == 1 ) {
			System.out.println("Please type the number of a Conversion Option:");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("3. Quit");
					menuSelection = scan.nextInt();
					if (menuSelection == 1) {
						System.out.println("Please enter the degrees Fahrenheit you would like to convert.");
						double f = scan.nextDouble();
						double c = ((f-32) * 5 / 9);
						System.out.println(f + " degrees Fahrenheit is " + c + " degrees Celsius");
					}
					else if (menuSelection == 2) {
						System.out.println("Please enter the degrees Celsius you would like to convert.");
						double c = scan.nextDouble();
						double f = ((c * 9 / 5) + 32);
						System.out.println(c + " degrees Celsius is " + f + " degrees Fahrenheit");
					}
					else {
						System.out.println("Have a Bright and Shinny Day");
					}
			
		} else if ( menuSelection == 2 ) {
			System.out.println("Please type the number of a Conversion Option:");
			System.out.println("1. Ounces to Cups");
			System.out.println("2. Liters to Gallons");
			System.out.println("3. Quit");
					menuSelection = scan.nextInt();
					if (menuSelection == 1) {
						System.out.println("Please enter the number of Ounces you would like to convert.");
						double o = scan.nextDouble();
						double c = (o / 8);
						System.out.println(o + " ounces converts to " + c + " cups");
					}
					else if (menuSelection == 2) {
						System.out.println("Please enter the number of Liters you would like to convert.");
						double l = scan.nextDouble();
						double g = (l * 0.264172);
						System.out.println(l + " Liters is " + g + " Gallons");
					}
					else {
						System.out.println("Have a Wonderful Day Full of Fun");
					}
		} else if ( menuSelection == 3 ) {
			System.out.println("Please type the number of a Conversion Option:");
			System.out.println("1. Feet to Meters");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Quit");
					menuSelection = scan.nextInt();
					if (menuSelection == 1) {
						System.out.println("Please enter the number of Feet you would like to convert.");
						double f = scan.nextDouble();
						double m = (f * 0.3048);
						System.out.println(f + " feet converts to " + m + " meters");
					}
					else if (menuSelection == 2) {
						System.out.println("Please enter the number of Miles you would like to convert.");
						double m = scan.nextDouble();
						double k = (m * 1.609344);
						System.out.println(m + " Miles is " + k + " Kilometers");
					}
					else {
						System.out.println("Have a Wonderful Trip");
					}
		} else {
			System.out.println("There are no more options. See you again soon.");
		}
	}	
}