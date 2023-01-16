package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a =  1000;
        int b = 200;

        //System.out.println(  a > b  );
        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("-----------------------------------");

        int score = 75;

        boolean passed = score >= 60;

        System.out.println(passed);


        System.out.println("---------------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol =  age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote =  age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("-------------------------------------------");

        System.out.println( 100 > 100); // false
        System.out.println( 100 >= 100); // true
        System.out.println(100 >= 85); // true

        System.out.println("------------------------------------------");

        score = 48;

        boolean failed = score < 60;

        System.out.println(failed);

        System.out.println(1000 < 10000); // true

        System.out.println("------------------------------------------");

        System.out.println( 95 <= 100);  // true

        System.out.println( 100 <= 100); // true

        System.out.println("------------------------------------------");

        // System.out.println("Java" <= "C#"); // >, <, <=, >= can only be applicable for numbers

        System.out.println( 'a' > 'b');
        //                  65  >  66




    }

}
