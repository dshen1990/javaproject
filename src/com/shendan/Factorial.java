package com.shendan;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int no = 5;
		int n1 = 7;
		int nub = n1 * i;
		int num = no * i;

		while (i < no) {
			num = num * i;
			i++;
		}

		i = 1;

		while (i < n1) {
			nub = nub * i;
			i++;
		}

		{
			System.out.println("Factorial of " + no + " = 5 * 4 * 3 * 2 * 1  = " + num);
			System.out.println("Factorial of " + n1 + " = 7 * 6 * 5 * 4 * 3 * 2 * 1 = " + nub);
		}

	}
}