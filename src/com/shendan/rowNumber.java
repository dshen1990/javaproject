package com.shendan;

public class rowNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 0;
		
		for(row=1; row<=7; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col + " ");
			}
			System.out.println("");
		}
	}

}
