package day03_variables;

public class ReplaceVariableName {
    public static void main(String[] args) {


        int firstVariable, secondVariable = 1;
        firstVariable = (secondVariable > 1) ? 2 : 1;
        switch (firstVariable) {
            case 0:
                System.out.print(0);
                break;
            case 1:
                System.out.print(1);
                break;
            case 2:
                System.out.print(2);
                break;
            case 3:
                System.out.print(3);
                break;
        }

    }

}