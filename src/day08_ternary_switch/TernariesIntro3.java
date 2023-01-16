package day08_ternary_switch;

public class TernariesIntro3 {

    public static void main(String[] args) {

        int score = 130;

        /*
        String result = "";
        if(score >= 0 && score <= 100){
            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
*/

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid Score";

        System.out.println(result);

        System.out.println("----------------------------------------");

        int n = 9;

        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";


        System.out.println(day);

    }
}
