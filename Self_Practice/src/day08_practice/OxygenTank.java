package day08_practice;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 80;

        String result = "Invalid Number";

        if (number >= 0 && number <= 100) {

            result = (number >= 90) ? "Your tank is full" : (number >= 80) ? "Still okay" : (number >= 70) ? "Don't go too far"
                    : (number >= 60) ? "Start to head back" : "Be careful";

        }


        System.out.println(result);
    }

}





/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
 and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%
                USE ONE PRINT STATEMENT ONLY
                Must use ternary
 */