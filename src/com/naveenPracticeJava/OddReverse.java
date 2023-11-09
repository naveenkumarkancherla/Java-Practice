package com.naveenPracticeJava;
import java.util.Scanner;
public class OddReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Odd numbers between "+n1+" to "+n2+" in Reverse order: ");
        for(int i = n2;i >= n1;i--) {
        	if(i%2 != 0) {
        		System.out.print(i+" ");
        	}
        }
	}

}
