package com.naveenPracticeJava;

public class OneDimentionalArray {

	public static void main(String[] args) {
		int[] i = {2,5,1,9,6};
		int sum = 0;
		for(int j = 0; j<i.length;j++) {
			sum += i[j];
		}
		System.out.println("The sum of array is "+sum);
		System.out.println("=====================================================================================================");
		
		int[] k = {2,5,3,9,6};
		int sumavg = 0,average;
		for(int j = 0; j<k.length;j++) {
			sumavg += k[j];
		}
		average = sumavg / k.length;
		System.out.println("The average of an array is: "+average);
		System.out.println("=====================================================================================================");
		
		String[] arr1 = {"chai","coffee"};
		String[] arr2 = {"milk","water","coke"};
		int length = arr1.length + arr2.length;
	    String[] mergedArray = new String[length];
	    for(int m=0; m < arr1.length; m++) {
	    	mergedArray[m] = arr1[m];
	    }
	    for(int n = 0; n < arr2.length;n++) {
	    	mergedArray[arr1.length+n] = arr2[n];
	    }
	    System.out.print("Merged array of two arrays is: ");
	    for(int l = 0; l < mergedArray.length; l++) {
	    	System.out.print(mergedArray[l]+", ");
	    }
	    System.out.println("\n=======================================================================================================");
	    
	    int[] a1 = {2,5,1,9,6};
	    int highest = 0,index = 0;
	    System.out.print("Highest among this array ");
	    for(int o = 0; o < a1.length; o++) {
	    	System.out.print(a1[o]+" ");
	    	if(highest < a1[o]) {
	    		highest = a1[o];
	    		index  = o;
	    	}
	    }
	    System.out.println(" is : "+highest+" and it's index is: "+index);
	    System.out.println("============================================================================================================");
	    
	    String[] words = {"coffee","water","chai","diet coke"};
	    String minLengthWord = words[0];
	    int wordIndex=0; 
	    for(int p = 0; p < words.length;p++) {
	    	System.out.print(words[p]+", ");
	    	if(minLengthWord.length() > words[p].length()) {
	    		minLengthWord = words[p];
	    		wordIndex = p;
	    	}
	    }
	    System.out.println("\nMinimum length word is "+minLengthWord+" and it's index is :"+ wordIndex);
	    System.out.println("===============================================================================================================");
	    
	    boolean[] array = {true,false,false,true,false,true};
	   
	    for(int q = 0; q < array.length ; q++) {
	    	System.out.print(array[q]+", ");
	    }
	    System.out.print("\nThe Reversed array of above array is :");
	    for(int q = array.length-1; q >= 0 ; q--) {
	    	System.out.print(array[q]+", ");
	    }
	}
	
    
}
