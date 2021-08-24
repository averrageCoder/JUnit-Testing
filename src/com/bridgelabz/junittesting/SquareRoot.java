package com.bridgelabz.junittesting;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no to find square root");
		double c = scan.nextDouble();
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}
		System.out.println("Square root of "+c+" is "+t);

	}

}
