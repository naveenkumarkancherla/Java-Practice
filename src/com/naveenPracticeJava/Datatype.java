package com.naveenPracticeJava;

public class Datatype {

	public static void main(String[] args) {
		System.out.println("This program is to know about Datatype ranges...!");
        byte b = 50;
        System.out.println("byte can store values from "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Size of Byte is "+Byte.SIZE/8+" byte");
        System.out.println("short can store values from "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Size of Short is "+Short.SIZE/8+" bytes");
        System.out.println("int can store values from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE+" but it canot store mobiles numbers of india!");
        System.out.println("Size of int is "+Integer.SIZE/8+" bytes");
        System.out.println("long can store values from "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Size of Long is "+Long.SIZE/8+" bytes");
        // we can't find minimum and max values for boolean and character data types
	}

}
