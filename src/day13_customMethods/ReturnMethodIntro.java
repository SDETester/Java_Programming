package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        //int total = sum(20 , 40);
        int total = addition(10, 20);//Sum is a void method, doesn't return any date


        double t = square(10);


        System.out.println( square(10) );
        System.out.println( cube(5));
        int r = cube(5);



    }
/*
    public static void sum(int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);

*/

    public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;

    }

    public static double square(int num) {
        int square = num * num;
        return square;

    }

    public static int cube(int num){
        double cube = square(num) * num;
        return (0);
    }




    }

