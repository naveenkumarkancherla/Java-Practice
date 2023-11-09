package com.naveenPracticeJava;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        switch(n%2) {
        case 0:
        	System.out.println("Then given number is Even");
        	break;
         default:
        	System.out.println("Then given number is Odd");
        	break;
        }
	}

}
