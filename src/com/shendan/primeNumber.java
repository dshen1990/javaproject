package com.shendan;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int i;
		for(i = 29; i <=28; i++) {
			if (29 %i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("29 is a Prime Number!");
		}else {
			System.out.println("29 is not a PrimeNumber!");
		}
	}

}
