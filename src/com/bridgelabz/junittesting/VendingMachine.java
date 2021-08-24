package com.bridgelabz.junittesting;

import java.util.Scanner;

public class VendingMachine {

	static int note[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int rem;
	static int change;
	static int amountToBeReturned;
	static int i = 0;
	static int total = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount: Rs");
		amountToBeReturned = scn.nextInt();
		VendingMachine.solve(amountToBeReturned, note);
		System.out.println("Total no. of notes " + total);
	}

	public static int solve(int amountToBeReturned, int note[]) {
		if (amountToBeReturned <= 0) {
			System.out.println("No more money needed to be returned");
			return 0;
		} 
		else {
			if (amountToBeReturned >= note[i]) {
				change = amountToBeReturned / note[i];
				rem = amountToBeReturned % note[i];
				amountToBeReturned = rem;
				total += change;
				System.out.println("No. of Rs " + note[i] + " to be returned is " + change);
			}
			i++;
			return solve(amountToBeReturned, note);
		}
	}
}
