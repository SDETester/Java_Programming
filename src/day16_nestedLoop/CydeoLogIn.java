package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){  // if the credentials are correct
            System.out.println("Logged in");
        }else{ // otherwise

            for (int i = 0; i < 3; i++) { //i : 0, 1, 2
                /*
                if(i != 2) {
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }
                 */

                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ //if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }

            }

            if( ! (u.equals("Cydeo") && p.equals("WoodenSpoon") ) ){ // after all three attempts, if the username & password are still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }


        }


        input.close();


    }



    public static void cydeoLogIn(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {
            System.out.println("Invalid credentials");
        }

    }






}

/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials
                if all three attempts are failed, then print "Your account is lucked."
 */


