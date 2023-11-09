package com.naveenPracticeJava;
import java.util.Scanner;
public class Prime {
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number n1: ");
        int n1 = sc.nextInt();
		System.out.print("Enter the number n2: ");
        int n2 = sc.nextInt();
        int counter;
        System.out.print("Prime number from "+n1+" to "+n2+" is: ");
        for(int i=n1; i <= n2; i++) {
        	counter = 0;
        	for(int j= 1; j <= i;j++) {
        		if(i%j == 0) {
        			counter++;
        		}
        	}
        	
        	if(counter == 2) {
    			System.out.print(i+" ");
    		}
        }
	}

}
