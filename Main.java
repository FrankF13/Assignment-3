package com.company;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		while(a<=1000) {
			if (a % 3 == 0 && a % 5 == 0 && a % 15 == 0) {
				System.out.println("Multiples of 3, 5, 15 = " + a);
			}
				a++;
			{
			}
		}
	}
}
