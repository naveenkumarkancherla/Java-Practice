package com.naveenPracticeJava;

public class CharacterCount {

	public static void main(String[] args) {
		String s1 = "JavaString@123$₹NAVEEN";
        int symbolCount = 0,capitalCount=0,smallCount=0,digitCount=0;
        for(int i=0; i<s1.length();i++) {
        	char ch = s1.charAt(i);
        	if(ch >= 'A' && ch <= 'Z') {
        		capitalCount++;
        	}
        	else if(ch >= 'a' && ch <= 'z') {
        		smallCount++;
        	}
        	else if(ch >= '0' && ch <= '9') {
        		digitCount++;
        	}
        	else {
        		symbolCount++;
        	}
        }
        System.out.println("Total string length is: "+s1.length());
        System.out.println("Capital letter count is: "+capitalCount);
        System.out.println("small letter count is: "+smallCount);
        System.out.println("digits  count is: "+digitCount);
        System.out.println("Symbols  count is: "+symbolCount);
        
        String s2 = "java is easy";
        
        char firstRepeat='\0';
        char firstNonRepeat='\0';
        for(int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            boolean isRepeated = false;
        	for(int j = 0; j < s2.length(); j++) {
                  if( i != j && currentChar == s2.charAt(j)) {
                	   isRepeated = true;
                	   break;
                  }   
               }
        	if(!isRepeated && firstNonRepeat == '\0') {
           	 firstNonRepeat = currentChar;
            }
            if( isRepeated && firstRepeat == '\0' ) {
           	 firstRepeat = currentChar;
            }
        }
        System.out.println("First repeat character is: "+firstRepeat);
        System.out.println("First Non repeat character is: "+firstNonRepeat);
        
	}

}
