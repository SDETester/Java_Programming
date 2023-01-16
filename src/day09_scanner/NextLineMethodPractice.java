package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //EnterEnter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); //Aaron King Daniel + Enter

        System.out.println("Enter your school name:");
        String school_name = input.nextLine(); // Cydeo School + Enter

        System.out.println("Enter your gender: ");
        String gender = input.next();  // Male

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28

        input.nextLine();  // Clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner

        System.out.println("Enter your street name:");
        String street = input.nextLine();




    }

}
