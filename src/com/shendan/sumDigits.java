package com.shendan;

public class sumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 145;
		int sum = 0;
		int digit = 0;
		while (number > 0) {
			digit = number%10;
			sum += digit;
			number = number/10;
		}
		System.out.println(sum);
	}

}
