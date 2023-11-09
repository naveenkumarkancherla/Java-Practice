package com.naveenPracticeJava;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number n2: ");
		int n2 = sc.nextInt();
		int sum=0;
		for(int i = n1; i <= n2; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println("\nsum of even numbers between "+n1+" and "+n2+" is "+sum);

	}

}
