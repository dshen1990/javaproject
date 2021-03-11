package com.shendan;

import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
	System.out.println("print a");	
		int a = scan.nextInt();
	System.out.println("print b");	
		int b = scan.nextInt();
		scan.close();

		System.out.println(a + "*" + b + " = " + a*b);
	}	

}
