package day08_ternary_switch;

public class TernariesIntro2 {

    public static void main(String[] args) {

        int number = 100;

        /*
        String result = "";
        if(number > 0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        */

        String result =  (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero" ;


        System.out.println("-----------------------------------------------");

        int n = 1;

        /*
        String day = "";
        if(n ==1){
            day = "Monday";
        }else if(n==2){
            day = "Tuesday";
        }else if(n==3){
            day = "Wednesday";
        }else if(n==4){
            day = "Thursday";
        }else if(n==5){
            day = "Friday";
        }else if(n==6){
            day = "Saturday";
        }else{
            day = "Sunday";
        }
    */

        String day = (n ==1)?"Monday" :(n==2)?"Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)? "Friday"
                :(n==6)? "Saturday" : "Sunday";

        System.out.println(day);

        System.out.println("------------------------------------------------");

        int num = 10; // 1~12

        String month;







    }

}
