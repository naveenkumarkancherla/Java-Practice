package com.naveenPracticeJava;

public class SumOfMultiDimentionalArray {

	public static void main(String[] args) {
		int[][] array = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
		};
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				sum += array[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of multi dimentional array is: "+sum);
	}

}
