package com.naveenPracticeJava;
import java.util.Scanner;
public class DivisibleBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number n2: ");
		int n2 = sc.nextInt();
		System.out.print("numbers divisible by 7 from "+n1+" to "+n2+" is: ");
		while(n1 <= n2) {
			if(n1%7 == 0) {
				System.out.print(n1+" ");
			}
			n1++;
		}

	}

}
