package com.naveenPracticeJava;

import java.util.Arrays;

public class NewStringArray {

    public static void main(String[] args) {
        String input = "java is super keka easy and awesome";
        String[] arr = input.split(" ");
        String[] newArray = new String[arr.length / 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                newArray[j] = arr[i];
                j++;
            }
        }

        System.out.println("Selected words:");
        for (String word : newArray) {
            System.out.print(word + ", ");
        }
        System.out.println();

        
        System.out.println("MAX_LENGTH_WORD");
        String s1 = "hello how are you Mommmmm heloooo";
        String[] str = s1.split(" ");
        System.out.println(Arrays.toString(str));

        String maxLength = "";
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if (maxLength.length() < str[i].length()) {
                maxLength = str[i];
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Max length word is: '" + maxLength + "' and its index is: " + index);
        }
    }
}
