package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 30000,
                creditScore = 800;
        String result ="";

        System.out.println(result);

        if(salary >= 45000 && creditScore >= 700) {
            //System.out.println("You are eligible for the loan");//
            result = "You are eligible for the loan";
        }else{
            System.out.println("You are not eligible for the loan");

        }

    }


}
