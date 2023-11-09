package com.naveenPracticeJava;

public class AddOfMDA {

	public static void main(String[] args) {
		int[][] array1 = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
			};
		int[][] array2 = {
				{2,6,8},
				{0,1,3},
				{1,2,4}
			};
		int[][] array3 = new int[array1.length][array2.length];
		for(int i = 0; i < array1.length; i++) {
			for(int j=0; j < array1[i].length; j++) {
				array3[i][j] += array1[i][j];
			}
		}
		for(int i = 0; i < array2.length; i++) {
			for(int j=0; j < array2[i].length; j++) {
				array3[i][j] += array2[i][j];
			}
		}
		for(int i = 0; i < array3.length; i++) {
			for(int j=0; j < array3[i].length; j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
