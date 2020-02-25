package com.juandiaz;

public class Main {

    public static void main(String[] args) {

        char myChar = '\u00A7';
        System.out.println("unicode output was: " + myChar);

        char newChar = '\u00AE';
        System.out.println("unicode output was:" + newChar);
        char sillyChar = 'A';
        System.out.println(sillyChar);

        String myString = "this is a string";
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " + myString);

    }
}
