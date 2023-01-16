package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")){

            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator:");
            char o = input.next().charAt(0);

            while (!(o == '+' || o == '-' || o == '*' || o == '/')) {  // while the operator is invalid
                System.err.println("Invalid Operator! please re-enter the math operator");
                o = input.next().charAt(0);
            }

            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();

            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 :(o == '*')? num1 * num2 : num1 /num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue?Yes/no");
            answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Answer! Would you like to continue?Yes/no");
                answer = input.next().toLowerCase();
            }


        }





    }

}

/*
1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator
			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */

