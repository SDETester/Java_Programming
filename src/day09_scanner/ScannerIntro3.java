package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        //    System.out.println("You have entered: "+ch);


        System.out.println("Would you like to continue?");
        String answer = input.next();  // I do not know ==> I
        // String answer = input.nextLine(); // I do not know ==> I do not know

        System.out.println("You have entered: " + answer);

        input.close();

    }

}

