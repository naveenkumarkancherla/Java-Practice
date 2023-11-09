package com.naveenPracticeJava;

public class Cat {
    
	public String breed = "German sephard ";
	public int height  = 30;
	public int weight = 35;
	public static void main(String[] args) {
		System.out.println("This is java programming!");
		Cat dog = new Cat();
		System.out.println(dog.breed);
		System.out.println("The height of "+dog.breed+"is "+dog.height);
		System.out.println("The weight of "+dog.breed+"is "+dog.weight);
	}

}
