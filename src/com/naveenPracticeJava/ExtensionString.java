package com.naveenPracticeJava;

public class ExtensionString {

	public static void main(String[] args) {
		String input1 = "passport.jpg";
		String input2 = "pancard.png";
		String input3 = "resume.pdf";
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		for(int i = 0; i < input1.length();i++) {
			char ch = (input1.charAt(i));
			   if(ch == '.') {
				index1 = i+1;
			}
		}
		
		for(int i = 0; i < input2.length();i++) {
			char ch = (input2.charAt(i));
			   if(ch == '.') {
				index2 = i+1;
			}
		}
		
		for(int i = 0; i < input3.length();i++) {
			char ch = (input3.charAt(i));
			   if(ch == '.') {
				index3 = i+1;
			}
		}
		 
		for(int i = 0; i < input1.length(); i++) {
			System.out.print(input1.substring(index1));
			break;
		}
		System.out.println();
		
		for(int i = 0; i < input2.length(); i++) {
			System.out.print(input2.substring(index2));
			break;
		}
		System.out.println();
		
		for(int i = 0; i < input3.length(); i++) {
			System.out.print(input3.substring(index3));
			break;
		}
		System.out.println();

	}
}
