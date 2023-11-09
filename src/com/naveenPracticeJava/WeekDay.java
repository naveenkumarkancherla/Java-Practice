package com.naveenPracticeJava;
import java.util.Scanner;
public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day number Ex:-Sunday-1,Monday-2,Tuesday-3,Wenesday-4,Thursay-5,Fridat-6,Saturday-7: ");
		int day = sc.nextInt();
		switch(day) {
		case 1:
		case 7:
			System.out.println("Yayy, it's a weekend!");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Uff, it's a weekday!");
			break;
		default:
			System.out.println("Inavlid day!");
			break;
			
		}

	}

}
