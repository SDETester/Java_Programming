package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {


        // age of the student is 28
        // salary is 10000

        int age = 28;
        int salary = 10000;


        //int age = 32; // variable name must bu unique

    /*Variable naming rules:
    1.readable, understandable, and meaningful
    2. must be UNIQUE
    3.camel case
    4.can not have special characters other than _ and $
    5. can not start with digits
    6.can not be java reserved words
    */

        int phoneNumber = 123456789; // camel case

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 80000.5;

        System.out.println("--------------------------------");

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        //double abstract = 5.5; // can not be java reserved name

        //String : for  String of texts""

        //gender is male
                String gender = "Male";

                String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);





    }

}





