package day06_practice;

public class NetInComeCalc {

        public static void main(String[] args) {

            int salary = 100000 ;
            boolean isMarried = true ;

            double taxRate = 0;

            if ( salary >= 130000)
                taxRate = 0.35 ;
            if ( salary  <= 129000 && salary >= 100000) {
                taxRate = 0.30 ;
            }
            if ( salary <= 99000 && salary >= 80000){
                taxRate = 0.25 ;
            }
            if ( salary <= 79000) {
                taxRate = 0.20 ;
            }
            if (isMarried) {
                taxRate = - 0.05 ;
            }
            double salaryAfterTax = salary - ( salary * taxRate) ;


            System.out.println(" Salary After Tax = " + salaryAfterTax);









        }
    }


