package com.bridgelabz.junittesting;

import java.util.Scanner;

public class TemperatureConversion {
	
	static char covertedUnit = ' ';
	
	public static int temperaturConversion(int temperature, char t) {
		int converted;
		if (t == 'c' || t == 'C') {
			converted = (temperature * 9 / 5) + 32;
			covertedUnit = 'F';
		} else if (t == 'f' || t == 'F') {
			converted = (temperature - 32) * 5 / 9;
			covertedUnit = 'C';
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return converted;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature with unit (c or f)");
		int temperature = scan.nextInt();
		char t = scan.next().charAt(0);

		if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
			System.out.println("Enter correct input!!");
		}
		
		temperature = temperaturConversion(temperature, t);
		System.out.println("Coverted temperature is " + temperature+"° "+covertedUnit);
	}

}
