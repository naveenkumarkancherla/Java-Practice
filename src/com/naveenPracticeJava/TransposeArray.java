package com.naveenPracticeJava;

public class TransposeArray {

	public static void main(String[] args) {
		int[][] array = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
		};
		int[][] transposeArray = new int[array.length][array.length];
		for(int i = 0; i < array.length ; i++) {
			for(int j = 0; j < array[i].length; j++) {
				transposeArray[i][j] = array[j][i];
			}
		}
		for(int i = 0; i < transposeArray.length ; i++) {
			for(int j = 0; j < transposeArray[i].length; j++) {
				System.out.print(transposeArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
