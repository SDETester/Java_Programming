package day10_string;

import java.util.Scanner;

    public class EmployeeInfo {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your full name:");
            String fullName =input.nextLine();

            System.out.println("Enter your age:");
            byte age = input.nextByte();

            System.out.println("Enter your gender:");
            char gender = input.next().charAt(0);

            input.nextLine();

            System.out.println("Enter your company name:");
            String companyName = input.nextLine();

            System.out.println("Enter your job title:");
            String job_title = input.nextLine();

            System.out.println("Enter your salary:");
            double salary = input.nextDouble();

            System.out.println("fullName = " + fullName);
            System.out.println("age = " + age);
            System.out.println("gender = " + gender);
            System.out.println("companyName = " + companyName);
            System.out.println("job_title = " + job_title);
            System.out.println("salary = $" + salary);

            input.close();

        }

    }

/*
2. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name ( nextLine() )
	        2.2 Enter your age ( nextByte())
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name ( nextLine() )
	        2.5 Enter your job title ( nextLine() )
	        2.6 Enter your salary (nextDouble() )
	        Display:
	            Employee's name
	            EMployee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary
 */

