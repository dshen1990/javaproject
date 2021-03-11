package com.shendan;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c;
		int i = 3;
		
		System.out.print (a + " ");
		System.out.print (b + " ");
		
		while(i< 5) {
			i++;
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(c + " ");
		}
	}

}
