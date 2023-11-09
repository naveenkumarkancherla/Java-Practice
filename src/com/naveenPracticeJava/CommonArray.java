package com.naveenPracticeJava;

public class CommonArray {

	public static void main(String[] args) {
		int[][] array1 = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		int[][] array2 = {
				{1,6,1},
				{0,7,3},
				{1,6,4}
		};
		int[][] newArray = new int[array1.length][array2.length];
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				newArray[i][j] = array1[i][j];
			}
		}
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				if(newArray[i][j] == array2[i][j]) {
					newArray[i][j] = 1;
				}
				else {
					newArray[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[i].length; j++) {
				System.out.print(newArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
