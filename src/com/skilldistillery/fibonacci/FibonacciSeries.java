package com.skilldistillery.fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 20; // Number of Fibonacci numbers to generate
		int f0 = 0; // First Fibonacci number
		int f1 = 1; // Second Fibonacci number

		System.out.println("0: " + f0);
		if (n > 1) {
			System.out.println("1: " + f1);
		}

		for (int i = 2; i < n; i++) {
			int next = f0 + f1;
			System.out.println(i + ": " + next); // Print the next number in the series
			f0 = f1; // Update the first number
			f1 = next; // Update the second number
		}
	}

}
