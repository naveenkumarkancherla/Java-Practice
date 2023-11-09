package com.naveenPracticeJava;

public class CompareStrings {

    public static void main(String[] args) {
        String s1 = "New York";
        String s2 = "NWYR";

        for (int i = 0; i < s1.length(); i++) {
            char char1 = Character.toLowerCase(s1.charAt(i));
            boolean found = false; 

            for (int j = 0; j < s2.length(); j++) {
                char char2 = Character.toLowerCase(s2.charAt(j));
                if (char1 == char2) {
                    System.out.print(s1.charAt(i));
                    found = true; 
                    break; 
                }
            }

            if (!found) {
                System.out.print("+");
            }
        }

        System.out.println();

        String firstName = "Stev";
        String lastName = "Jobs";
        System.out.println(lastName + "," + firstName.charAt(0));
    }
}
