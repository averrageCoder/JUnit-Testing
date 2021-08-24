package com.bridgelabz.junittesting;

public class BinaryRepresentation {

	static void toBinary(int n)
    {
        int[] binaryNum = new int[32];
        int originalNumber = n;
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        System.out.print("Binary Representation of "+originalNumber+" is ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
 
    public static void main(String[] args)
    {
        int n = 17;
        toBinary(n);
    }

}
