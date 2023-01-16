package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", "");
        // trim(0 & replace() methods will make sure that the white spaces & additionals spaces between the characters will be removed

        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace(" ", "");

        input.close();



        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //getting first character of first name  +  the remaining characters of the first name

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);



    }

}

/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School
 */




/*package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] not_in_use) {
        Scanner input = new Scanner(System.in);


        /*{
            Scanner keyboard = new Scanner( System.in ) ;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first name");
            String first = input.next().trim();

            System.out.println("Enter your last name");
            String last = input.next().trim();

            System.out.println("Enter your age");
            String age = input.next().trim();

            System.out.println("Enter your city");
            String city = input.next().trim();

            System.out.println("Enter your adres");
            String adres = input.next().trim();

            String  first_name ;
            String  last_name ;
            String  your_age;



            System.out.print( "Enter your first name" ) ;
            first_name  =  keyboard.nextLine() ;
            System.out.print( "Enter your last name" ) ;
            last_name   =  keyboard.nextLine() ;

            System.out.print( "Enter your first and last name"
                    +  first_name  +  " "  +  last_name  +  " " ) ;
        }
    }

            System.out.println("Enter your first name");
            String first = input.nextLine().trim().replace(" ", replacement: " ");

            System.out.println("Enter your last name");
        String last = input.nextLine().trim().replace( target " ");


}

}*/