package com.juandiaz;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);


        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

previousResult = result;
result = result + 1;
System.out.println("Result is now " + result);

result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        int topScore = 80;
        if (topScore < 100)
        System.out.println("You Got the HIgh Score!");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

if((topScore >90) || (secondTopScore <=90))
                System.out.println("one of these test is true");

boolean isCar = false;
if (isCar = true)
    System.out.println("this is not supposed to happened");

isCar = true;
boolean wasCar = isCar ? true : false;
if (wasCar)
    System.out.println("wasCar is true");

double variableOne = 20;
double variableTwo = 80;
double resultVariable = (variableOne + variableTwo) * 25;
double theRemainder = resultVariable % 40;
if (theRemainder <=20)
    System.out.println("Total was over");
    }
}
