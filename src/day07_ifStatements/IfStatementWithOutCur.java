package day07_ifStatements;

public class IfStatementWithOutCur {

    public static void main(String[] args) {

        int age =32;

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("------------------------------------------");

        if(age >=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("------------------------------------------");

        /*
        int itemNum = 1;
        if(itemNum == 1)
            System.out.println("Eggs");
            System.out.println("Orange");
        else if(itemNum == 2)
            System.out.println("Milk");
            System.out.println("Onion");
        else
            System.out.println("Apple");
            System.out.println("Cherry");
        */

        int day = 2; // 1 ~ 7

        if(day == 1) System.out.println("Monday");
        else if(day == 2) System.out.println("Tuesday");
        else if(day == 3) System.out.println("Wednesday");
        else if(day ==4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if(day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");


        // IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE






    }


}

