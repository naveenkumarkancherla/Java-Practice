package com.naveenPracticeJava;

public class Variables {
        int a = 100;  // non-static variable --> cannot access without an object
        static int b = 120;  // static variable or class variable
	
	public static void main(String[] args) {
		// we have 4 types of variables
		// 1 Instance variable (Non static fields) --> if you want access any variable outside the method you need to create object
		// 2 Class Variable (static fields)  --> for static variables you can directly access variable values
		// 3 Local Variable  --> creating variable inside the method and can access only locally
		// 4 Parameters   --> defining a variables in method without initialization
		  
		
		// Rules to create a variable
		// case sensitive
		// use camel case in large no of words
		// variable names should be self explanatory , variable names should be meaningful
		// we can use _ and $ in variables but starting with theses symbols is not recommended
        Variables var = new Variables();
        System.out.println(var.a);
		System.out.println(b);
	}

}
