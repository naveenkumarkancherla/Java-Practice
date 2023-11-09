package com.naveenPracticeJava;

import java.util.Scanner;
public class PolindromeOrnot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String s1 = sc.nextLine();
		String rev = "";
		for(int i = s1.length()-1 ; i >= 0; i--) {
			rev += s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println("It is a polindrome");
		}
		else {
			System.out.println("It is not a polindrome");
		}
	}

}
