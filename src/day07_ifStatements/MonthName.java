package day07_ifStatements;

public class MonthName {

    public static void main(String[] args) {

        int n = 12;

        String month = "";

        if(n >= 1 && n <= 12){

            if(n==1) month = "January";
            else if(n==2) month = "February";
            else if(n==3) month = "March";
            else if(n==4) month = "April";
            else if(n==5) month = "May";
            else if(n==6) month = "June";
            else if(n==7) month = "July";
            else if(n==8) month = "August";
            else if(n==9) month = "September";
            else if(n==10) month = "October";
            else if(n==11) month = "November";
            else month = "December";

        }else{
            month = "No such a month";
        }

        System.out.println("month = " + month);



    }


}
