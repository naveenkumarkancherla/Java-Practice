package com.naveenPracticeJava;
import java.util.Scanner;
public class ArithematicOperations {
        
	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        System.out.println("Enter an Operator:");
        char operator = sc.next().charAt(0);
        switch(operator) {
        case '+':
        	result = n1+n2;
        	System.out.println("Result of "+operator+" operator is :"+ result);
        	break;
        case '-':
        	result = n1-n2;
        	System.out.println("Result of "+operator+" operator  is :"+ result);
        	break;
        case '*':
        	result = n1*n2;
        	System.out.println("Result of "+operator+" operator is :"+ result);
        	break;
        case '/':
        	result = n1/n2;
        	System.out.println("Result of "+operator+" operator is :"+ result);
        	break;
        case '%':
        	result = n1%n2;
        	System.out.println("Result of "+operator+" operator is :"+ result);
        	break;
        default:
        	System.out.println("Invalid Operator!");
        	break;
        	
        }
        
        
	}

}
