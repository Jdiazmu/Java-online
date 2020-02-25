package com.juandiaz;

public class Main {

    public static void main(String[] args) {
        //int value = 3;
        //if(value == 1) {
        //    System.out.println("value was 1");
        // } else if (value == 2) {
        //     System.out.println("value was 2");
        //} else {
        //     System.out.println("was not 1 or 2");

        // }

        //   int switchValue = 1;
        //   switch (switchValue) {
        //        case 1:
        //          System.out.println("value was 1");
        //           break;

        //       case 2:
        //         System.out.println("value was 2");
        //break;

        //   case 3:
        //   case 4:
        //  case 5:
        //      System.out.println("was a 3, or a 4, or a 5");
        //     System.out.println("actually it was a " + switchValue);
        //     break;

        //  default:
        //      System.out.println("was not 1,2,3, 4 or 5");
        //      break;
        //  }
        //  }
//}

        char switchState = 'F';
        switch(switchState) {
            case 'A':
                System.out.println("Was A ");
                break;

            case 'B':
                System.out.println("Was not A, but B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("Was C,D, or E");
                System.out.println("it was actually" + switchState);
                break;

            default:
                System.out.println("not found");
                break;
        }
    }
}