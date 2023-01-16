package day08_practice;

public class Calculator {

    public static void main(String[] args) {

        double n1 =100,
                n2 =200;

        char operator = '-';

        switch (operator){
            case '-':
                System.out.println(n1-n2);
                break;

            case '+':
                System.out.println(n1+n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            case '/':
                System.out.println(n1-n2);
                break;

            default:
                System.out.println("Invalid Operator");

        }


    }

}
