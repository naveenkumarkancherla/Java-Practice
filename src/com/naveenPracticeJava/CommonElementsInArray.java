package com.naveenPracticeJava;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int[][] array1 = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		int[][] array2 = {
				{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{8,3}
		};
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				for(int n = 0; n < array2.length; n++) {
					for(int m = 0; m < array2[n].length; m++) {
						if(array1[i][j] == array2[n][m]) {
							System.out.print(array1[i][j]+" ");
						}
					}
				}
			}
		}
		

	}

}
