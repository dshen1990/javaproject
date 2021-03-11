package com.shendan;

import java.util.Scanner;

public class Pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("print a");
		int a = scan.nextInt();
		
		
		
		if(a>0) {
			System.out.println(a + " is positve");
		}
		else if (a==0 ) {System.out.println(a + " is 0");
	}
		else {System.out.println(a + " is neg");}
}
	
}