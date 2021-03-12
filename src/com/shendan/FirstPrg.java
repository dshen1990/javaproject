package com.shendan;

public class FirstPrg {
	public static void main(String[] args) {
		int row = 0;

		for (row = 1; row <= 6; row++) {
			for (int space = row; space <= 6; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (row = 7; row <= 12; row++) {
			for (int space = 12-row; space <= 6; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 12-row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
