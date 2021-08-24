package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Binary {
	
	public static int[] toBinary(int d) {

		String bin = "";
		while (d != 0) {
			bin = (d % 2) + bin;
			d /= 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}


	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
	
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}

	public static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
			temp = (int) Math.pow(2, i);
		}
		return false;
	}

	public static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length/2;
		for (int i = 0; i < 4; i++) { 
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}				

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a no");
		int[] binary = toBinary(scan.nextInt());
		System.out.print("Binary representation is ");
		showArr(binary);
		swapNibbles(binary);
		System.out.print("\nAfter swapping ");
		showArr(binary);
		int swapDec = toDecimal(binary);
		System.out.println("\nDecimal of swapped binary is " + swapDec);

		if (powerOf2(swapDec))
			System.out.println("\nIt is power of 2");
		else
			System.out.println("\nIt is NOT a power of 2");
		scan.close();
	}

}