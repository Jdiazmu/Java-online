package com.juandiaz;

public class Main {

    public static void main(String[] args) {
	// int has a width of 32
int myMinValue = 600;

// byte has a width of 6
byte myByteValue = 100;


// short has a width of 16
short myShortValue = 200;

// a long has a width of 64
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myMinValue);
        System.out.println("myLongValue = " + myLongValue);
    }
}
