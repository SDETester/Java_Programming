package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -300;


        if (score >= 0 && score <= 100) {  // if the score is valid

            if (score >= 60) { // if the score is greater or equal to 60
                System.out.println("Passed");
            } else { // if the score is less than 60
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }


        System.out.println("------------------------------------------------");

        int age = -200; // 1 ~ 150

        if (age >= 1 && age <= 150) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }

        } else {
            System.out.println("Invalid age");
        }

        System.out.println("------------------------------------------------");


        int day = 100;

        /*
        if(day == 1){
            System.out.println("Monday");
        }else if(day ==2){
            System.out.println("Tuesday");
        }else if(day ==3){
            System.out.println("Wednesday");
        }else if(day ==4){
            System.out.println("Thursday");
        }else if(day ==5){
            System.out.println("Friday");
        }else if(day ==6){
            System.out.println("Saturday");
        }else if(day ==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Number");
        }
         */


        if (day >= 1 && day <= 7) {

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else { // if the precondition is failed
            System.out.println("Invalid Day");
        }


    }

}