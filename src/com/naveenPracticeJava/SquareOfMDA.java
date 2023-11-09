package com.naveenPracticeJava;

public class SquareOfMDA {

	public static void main(String[] args) {
		int[][] array = {
				{2,3,5},
				{0,1,3},
				{1,2,4}
		};
		int[][] squareArray = new int[array.length][array.length];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				squareArray[i][j] = array[i][j]*array[i][j];
			}
		}
		for(int i = 0; i < squareArray.length; i++) {
			for(int j = 0; j < squareArray.length; j++) {
				System.out.print(squareArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
