package com.bridgelabz.junittesting;

import java.util.Scanner;

public class MonthlyPayment {
	
	public static double monthlyPayment(double p, double y, double r) {
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal, year and rate!");
		double p = scan.nextDouble();
		double y = scan.nextDouble();
		double r = scan.nextDouble();
		scan.close();
		System.out.println("Mothly payment is " + monthlyPayment(p, y, r));

	}

}
