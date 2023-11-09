package com.naveenPracticeJava;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "java is super";
		System.out.println("The length of '"+s1+"' is: "+s1.length());
        System.out.println("The no.of words in a '"+s1+"' is: "+s1.split(" ").length+" those words are :"+Arrays.toString(s1.split(" ")));
        String s2 = "Hello world";
        int count = 0;
        for(int i = 0; i < s2.length(); i++) {
        	if(s2.charAt(i) == 'l') {
        		count++;
        	}
        }
        System.out.println("No.of occurences in "+s2+" is: "+count);
        
        System.out.print("Reverse of '"+s1+"' is: ");
        for(int i = s1.length()-1; i >= 0; i--) {
        	System.out.print(s1.charAt(i));
        }
        System.out.println();
        
        String s3 = "     hello hello hello   ";
        System.out.println("Removing spaces at starting and ending of '"+s3+"' is: " +s3.trim());
        
        String[] s4 = s1.split(" ");
        System.out.println(Arrays.toString(s1.split(" ")));
        for (String word : s4) {
            for (int i = word.length() - 1; i >= 0; i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();
        
        String s5 = "this is a test String!";
        String[] s6 = s5.split(" ");
        
        for (int i = 0; i < s6.length; i++) {
            String word = s6[i];
            
            if (i % 2 == 0) { // Even position
                System.out.print(word.toLowerCase() + " ");
            } else { // Odd position
                System.out.print(word.toUpperCase() + " ");
            }
        }

	}

}
